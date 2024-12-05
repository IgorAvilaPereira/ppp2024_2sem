package negocio;

public class ConfiguracaoUsuario {
    private static ConfiguracaoUsuario INSTANCE = new ConfiguracaoUsuario();

    private String idioma;
    private String tema;
    private String sistemaOperacional;

    private ConfiguracaoUsuario(){

    }
    

    public static synchronized ConfiguracaoUsuario getInstance(){
        return INSTANCE;
    }


   

    public String getIdioma() {
        return idioma;
    }


    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }


    public String getTema() {
        return tema;
    }


    public void setTema(String tema) {
        this.tema = tema;
    }


    public String getSistemaOperacional() {
        return sistemaOperacional;
    }


    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    
}
