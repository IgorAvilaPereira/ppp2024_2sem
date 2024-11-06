/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Markdown;
import negocio.DocumentMarkdown;
import negocio.Title;
import negocio.Link;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Markdown documentoMarkdown = new DocumentMarkdown();
        documentoMarkdown = new Title(documentoMarkdown, "Exemplo");
        documentoMarkdown = new Link(documentoMarkdown, "google", "http://www.google.com");
        System.out.println(documentoMarkdown.getCode());
        System.out.println("=============");
        
        
    }
}
