/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.ListarCommand;
import negocio.AdicionarCommand;
import negocio.Command;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.get;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Command> rotas = new HashMap();
        
        rotas.put("adicionar", new AdicionarCommand());
        rotas.put("listar", new ListarCommand());

        get("/:action", (request, response) -> {
            try {
                Command comand = rotas.get(request.params(":action"));
                comand.setRequest(request);
                comand.setResponse(response);
                return comand.execute();
            } catch (Exception e) {
                return "<b style='color:red'>url invalida </b>";
            }
        });
        
        
     


    }
}
