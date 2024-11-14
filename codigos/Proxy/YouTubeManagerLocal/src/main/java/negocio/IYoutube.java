/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import com.github.kiulian.downloader.model.videos.VideoInfo;

/**
 *
 * @author iapereira
 */
public interface IYoutube {

    public Video requestDetails(String videoId);

    public Video download(String videoId);

    public Subtitle downloadSubtitle(String videoId);

}
