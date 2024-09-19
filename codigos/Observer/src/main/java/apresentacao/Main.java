/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Noticia;
import negocio.Pessoa;
import negocio.PessoaJuridica;
import negocio.Portal;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Portal portalG1 = new Portal();
                
        Pessoa igor = new Pessoa("Igor");
        portalG1.addSubscribe(igor);
        Pessoa marcio = new Pessoa("Marcio");
        portalG1.addSubscribe(marcio);
        PessoaJuridica twitter = new PessoaJuridica();
        twitter.setNome("x");
        twitter.setCnpj("aqui n....");
        
        portalG1.addSubscribe(twitter);
        
        Noticia noticia = new Noticia();
        noticia.setTexto("Ontem ocorreu as defesas de tcc do tads ifrs rio grande");
        noticia.setTitulo("agora que vai rolar formatura");
        portalG1.changeState(noticia);
        
        portalG1.removeSubscribe(marcio);
        
        
        Noticia noticia2 = new Noticia();
        noticia2.setTexto("texto da noticia que ja n conta com o marcio");
        noticia2.setTitulo("noticia 2");
        portalG1.changeState(noticia2);
        
    }
}
