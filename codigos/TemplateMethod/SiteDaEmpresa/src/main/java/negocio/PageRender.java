/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class PageRender {
    
    public final String renderPage(){
        return "<html>"
                + "<head> " + showHead() + "</head> "
                + "<body> <h1> Pagina da Empresa </h1> " + showBody() + "</body> "
                + "</html>";
    }

    private String showHead() {
        return "<title> SiteEmpresa X </title>";
    }

    protected abstract String showBody();
    
}
