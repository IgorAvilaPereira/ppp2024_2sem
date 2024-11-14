/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.github.kiulian.downloader.Config;
import com.github.kiulian.downloader.YoutubeDownloader;
import com.github.kiulian.downloader.downloader.request.RequestPlaylistInfo;
import com.github.kiulian.downloader.downloader.request.RequestSubtitlesDownload;
import com.github.kiulian.downloader.downloader.request.RequestVideoFileDownload;
import com.github.kiulian.downloader.downloader.request.RequestVideoInfo;
import com.github.kiulian.downloader.downloader.response.Response;
import com.github.kiulian.downloader.model.Extension;
import com.github.kiulian.downloader.model.playlist.PlaylistDetails;
import com.github.kiulian.downloader.model.playlist.PlaylistInfo;
import com.github.kiulian.downloader.model.subtitles.SubtitlesInfo;
import com.github.kiulian.downloader.model.videos.VideoInfo;
import com.github.kiulian.downloader.model.videos.formats.Format;
import com.github.kiulian.downloader.model.videos.formats.VideoFormat;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author iapereira
 */
public class Youtube implements IYoutube {

    public static final String PATH = "my_videos";
    private final YoutubeDownloader downloader;
    private final Config config;

    public Youtube() {
        downloader = new YoutubeDownloader();
        config = new Config.Builder()
                .maxRetries(1)
                .build();
        config.setMaxRetries(0);
    }

    @Override
    public Subtitle downloadSubtitle(String videoId) {
        List<SubtitlesInfo> subtitlesInfo = this.requestDetails(videoId).getVideoInfo().subtitlesInfo();

//        for (SubtitlesInfo info : subtitlesInfo) {
        RequestSubtitlesDownload request = new RequestSubtitlesDownload(subtitlesInfo.get(0))
                // optional
                .formatTo(Extension.JSON3)
                .translateTo("pt-br");
        Response<String> responseSubtitle = downloader.downloadSubtitle(request);
        String subtitlesString = responseSubtitle.data();
        String downloadUrl = request.getDownloadUrl();
        Subtitle subtitle = new Subtitle();
        subtitle.setLinkDownload(downloadUrl);
        subtitle.setSubtitlesString(subtitlesString);
        return subtitle;
//            System.out.println(subtitlesString);
//            System.out.println(downloadUrl);
//        }
    }

    @Override
    public Video requestDetails(String videoId) {
        RequestVideoInfo request = new RequestVideoInfo(videoId);
        Response<VideoInfo> response = downloader.getVideoInfo(request);
        VideoInfo videoInfo = response.data();
        Video video = new Video();
        video.setAutor(videoInfo.details().author());
        video.setIsLive(videoInfo.details().isLive());
        video.setTitle(videoInfo.details().title());
        video.setVideoId(videoId);
        video.setVideoInfo(videoInfo);
        return video;
    }

    @Override
    public Video download(String videoId) {
        VideoInfo videoInfo = this.requestDetails(videoId).getVideoInfo();
        File outputDir = new File(Youtube.PATH);
        List<VideoFormat> videoFormats = videoInfo.videoFormats();
        Format format = videoFormats.get(0);
        RequestVideoFileDownload request = new RequestVideoFileDownload(format)
                // optional params    
                .saveTo(outputDir) // by default "videos" directory
                .renameTo(videoId) // by default file name will be same as video title on youtube
                .overwriteIfExists(true); // if false and file with such name already exits sufix will be added video(1).mp4
        System.out.println("Realizando o Download....(favor espere)");
        Response<File> response = downloader.downloadVideoFile(request);
        System.out.println("Terminando o Download");
        return new Video(videoId, videoInfo, response.data());
    }

    public PlaylistDetails playlistDetails(String playlistId) {
        RequestPlaylistInfo request = new RequestPlaylistInfo(playlistId);
        Response<PlaylistInfo> response = downloader.getPlaylistInfo(request);
        PlaylistInfo playlistInfo = response.data();

        // playlist details
        PlaylistDetails details = playlistInfo.details();
        System.out.println(details.title());
        System.out.println(details.videoCount());

        // get video details
        //PlaylistVideoDetails videoDetails = playlistInfo.videos().get(0);
        //System.out.println(videoDetails.videoId());
        //System.out.println(videoDetails.title());
        //System.out.println(videoDetails.index());
        return details;
    }
}
