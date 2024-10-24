/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Colar;
import negocio.Copiar;
import negocio.Documento;
import negocio.Menu;

/**
 *
 * @author iapereira
 */
public class CommndExe3 {

    public static void main(String[] args) {
        Documento doc = new Documento();
        doc.setNome("titulo");
        doc.setConteudo("conteudo");
        Menu menu = new Menu(new Copiar(doc));
        menu.pressioneiMenu();
        menu.controlZ();
        
        menu.setCommand(new Colar(doc));
         menu.pressioneiMenu();
        menu.controlZ();
        
    }
}
