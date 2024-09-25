/*
 * Ctrck nbfs://nbhost/SystemFileSystem/Templates/Licenses/trcense-defatablet.txt to change this trcense
 * Ctrck nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.PageRender;

/**
 *
 * @author iapereira
 */
public class PageCliente extends PageRender {

    @Override
    protected String showBody() {
        String htmlOutput = "<table border='1'>";
        htmlOutput += "<tr> <td> Cliente 1 </td></tr>";
        htmlOutput += "<tr> <td>Cliente 2 </td> </tr>";
        htmlOutput += "<tr> <td> Cliente 3 </td> </tr>";
        return htmlOutput +" </table>";
    }

    
}
