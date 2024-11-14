/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import com.github.kiulian.downloader.model.videos.VideoInfo;
import negocio.Subtitle;
import negocio.Video;
import negocio.Youtube;

/**
 *
 * @author iapereira
 */
public class Main {

    // Adaptação de https://github.com/sealedtx/java-youtube-downloader
    public static void main(String[] args) {
        String videoId = "hsZVlDQEwnI";
        Youtube youtube = new Youtube();
//        VideoInfo videoInfo = youtube.requestDetails(videoId);
//        System.out.println(videoInfo.details().author());
        
//        Subtitle subtitle = youtube.downloadSubtitle(videoId);
//        System.out.println(subtitle.getLinkDownload());
        
        Video videoResult = youtube.download(videoId);
//        System.out.println(videoResult.getData().getAbsolutePath());
    }

}
