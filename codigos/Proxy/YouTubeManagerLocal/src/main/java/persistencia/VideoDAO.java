/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Video;
import negocio.Youtube;

/**
 *
 * @author iapereira
 */
public class VideoDAO {

    public Video obter(String videoId) throws SQLException {
        Video video = new Video();
        String sql = "SELECT * FROM video where trim(video_id) = trim(?);";
        Connection conexao = new ConexaoPostgreSQL().getConnection();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, videoId);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            video.setId(rs.getInt("id"));
            video.setVideoId(videoId);
            video.setAutor(rs.getString("autor"));
            video.setIsLive(rs.getBoolean("is_live"));
            video.setTitle(rs.getString("title"));
        }
        conexao.close();
        preparedStatement.close();
        return video;
    }

    public boolean inserir(Video video) throws SQLException {
        String sql = "INSERT INTO video (autor, is_live, video_id, title) values (?,?,?, ?) returning id;";
        Connection conexao = new ConexaoPostgreSQL().getConnection();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, video.getAutor());
        preparedStatement.setBoolean(2, video.isIsLive());
        preparedStatement.setString(3, video.getVideoId());
        preparedStatement.setString(4, video.getTitle());

        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            video.setId(rs.getInt("id"));
        }
        conexao.close();
        preparedStatement.close();
        return ((video.getId() != 0));

    }

}
