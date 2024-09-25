/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PageFuncionario extends PageRender {

    @Override
    protected String showBody() {
        String htmlOutput = "<ul>";
        htmlOutput += "<li> Igor </li>";
        htmlOutput += "<li> Betito </li>";
        htmlOutput += "<li> Marcio </li>";
        return htmlOutput +" </ul>";
    }
    
}
