/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iapereira
 */
public class ConexaoPostgreSQL {

    private String host;
    private String port;
    private String username;
    private String password;
    private String dbname;

    public ConexaoPostgreSQL() {
        this.host = "localhost";
        this.dbname = "youtube";
        this.username = "postgres";
        this.password = "postgres";
        this.port = "5432";
    }

    public Connection getConnection() {
        String url = "jdbc:postgresql://" + this.host + ":" + this.port + "/" + dbname;
        try {
            return DriverManager.getConnection(url, this.username, this.password);
        } catch (SQLException e) {
            System.out.println("deu ruim!");
        }
        return null;
    }

}
