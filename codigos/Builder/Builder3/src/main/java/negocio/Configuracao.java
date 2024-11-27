/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Configuracao {
    private static Configuracao INSTANCE;
    
    private String username;
    private String idioma;
    private String versao;
    private String so;
    
    private Configuracao(){
        
    }
    
    public static synchronized Configuracao getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Configuracao();
        }
        return INSTANCE;
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
    
    
    
}
