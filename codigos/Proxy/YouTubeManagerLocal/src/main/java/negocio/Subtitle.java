/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Subtitle {
    private String subtitlesString;
    private String linkDownload;

    public String getSubtitlesString() {
        return subtitlesString;
    }

    public void setSubtitlesString(String subtitlesString) {
        this.subtitlesString = subtitlesString;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }

    @Override
    public String toString() {
        return "Subtitle{" + "subtitlesString=" + subtitlesString + ", linkDownload=" + linkDownload + '}';
    }

    
    
}
