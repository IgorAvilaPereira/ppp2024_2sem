/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.github.kiulian.downloader.model.videos.VideoInfo;
import java.io.File;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import negocio.Video;
import persistencia.VideoDAO;

/**
 *
 * @author iapereira
 */
public class YoutubeProxy implements IYoutube {

    private Youtube youtube;
    private VideoDAO videoDAO;

    public YoutubeProxy() {
        this.videoDAO = new VideoDAO();

    }

    @Override
    public Video requestDetails(String videoId) {
        try {
            Video video = this.videoDAO.obter(videoId);
            if (video.getId() != 0) {
                return video;
            } else {
                if (this.youtube == null) this.youtube = new Youtube();
                return this.youtube.requestDetails(videoId);
            }
        } catch (SQLException ex) {
            Logger.getLogger(YoutubeProxy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Video download(String videoId) {
        Video video;
        try {
            video = this.videoDAO.obter(videoId);
            if (video.getId() != 0) {
                throw new IllegalArgumentException("meu irmão, tu já baixou! o meu rei! não baixe de novo!");
            } else {
                if (this.youtube == null) {
                    this.youtube = new Youtube();
                }
                video = this.youtube.download(videoId);
                video.setVideoId(videoId);
                video.setTitle(video.getVideoInfo().details().title());
                video.setAutor(video.getVideoInfo().details().author());
                video.setIsLive(video.getVideoInfo().details().isLive());
                this.videoDAO.inserir(video);
                return video;
            }
        } catch (SQLException ex) {
            Logger.getLogger(YoutubeProxy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Subtitle downloadSubtitle(String videoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    
//    public Set<String> listFilesUsingJavaIO(String dir) {
//        return Stream.of(new File(dir).listFiles())
//                .filter(file -> !file.isDirectory())
//                .map(File::getName)
//                .collect(Collectors.toSet());
//    }
}
