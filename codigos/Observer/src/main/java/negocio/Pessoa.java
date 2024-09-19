/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pessoa implements Observer {
    private String nome;
    private Noticia ultimaNoticia;
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    @Override
    public void update(Subject subject) {
        Portal p = (Portal) subject;
        System.out.println(this.nome+":"+p.getVetNoticia().get(p.getVetNoticia().size()-1));
        this.ultimaNoticia = p.getVetNoticia().get(p.getVetNoticia().size()-1);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Noticia getUltimaNoticia() {
        return ultimaNoticia;
    }

    public void setUltimaNoticia(Noticia ultimaNoticia) {
        this.ultimaNoticia = ultimaNoticia;
    }
    
    
    
}
