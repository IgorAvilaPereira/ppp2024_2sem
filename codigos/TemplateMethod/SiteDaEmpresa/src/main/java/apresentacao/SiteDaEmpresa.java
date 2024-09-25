/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;
import negocio.PageCliente;
import negocio.PageFuncionario;
import static spark.Spark.*;

/**
 *
 * @author iapereira
 */
public class SiteDaEmpresa {

    public static void main(String[] args) {
        
        get("/", (request, response) -> new PageFuncionario().renderPage());
        get("/clientes", (request, response) -> new PageCliente().renderPage());
    }
}
