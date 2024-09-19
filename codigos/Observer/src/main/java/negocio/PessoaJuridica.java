/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author iapereira
 */
public class PessoaJuridica implements Observer {
    private String nome;
    private String cnpj;
    
    private Noticia ultimaNoticia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }   
    

    @Override
    public void update(Subject subject) {
        Portal p = (Portal) subject;
        this.ultimaNoticia = p.getVetNoticia().get(p.getVetNoticia().size()-1);
        JOptionPane.showMessageDialog(null, this.nome+":"+p.getVetNoticia().get(p.getVetNoticia().size()-1), "PortalG1", JOptionPane.INFORMATION_MESSAGE);
//        return this.nome+":"+p.getVetNoticia().get(p.getVetNoticia().size()-1);
    }

    public Noticia getUltimaNoticia() {
        return ultimaNoticia;
    }

    public void setUltimaNoticia(Noticia ultimaNoticia) {
        this.ultimaNoticia = ultimaNoticia;
    }
    
    
    
}
