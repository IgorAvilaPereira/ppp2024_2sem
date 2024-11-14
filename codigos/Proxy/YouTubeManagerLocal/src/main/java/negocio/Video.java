/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.github.kiulian.downloader.model.videos.VideoInfo;
import java.io.File;

/**
 *
 * @author iapereira
 */
public class Video {
    
    private int id;
    
    private String videoId;
    private VideoInfo videoInfo;
    private File data;
    
    private boolean isLive;
    private String autor;
    private String title;

    public Video(String videoId, VideoInfo videoInfo, File data) {
        this.videoId = videoId;
        this.videoInfo = videoInfo;
        this.data = data;
    }

    public Video() {
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public VideoInfo getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }

    public boolean isIsLive() {
        return isLive;
    }

    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    
    
    

    
    
}
