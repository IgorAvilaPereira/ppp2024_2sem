/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.util.HashMap;
import java.util.Map;
import negocio.Noticia;
import negocio.Pessoa;
import negocio.Portal;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.template.mustache.MustacheTemplateEngine;

/**
 *
 * @author iapereira
 */
public class MainSpark {

    public static void main(String[] args) {
        Portal portalG1 = new Portal();
        Pessoa igor = new Pessoa("Igor");
        portalG1.addSubscribe(igor);
        Pessoa marcio = new Pessoa("Marcio");
        portalG1.addSubscribe(marcio);

        get("/", (rq, rs) -> new ModelAndView(new HashMap(), "index.html"), new MustacheTemplateEngine());

        post("/add_noticia", (request, response) -> {
            Noticia noticia = new Noticia();
            noticia.setTitulo(request.queryParams("titulo"));
            noticia.setTexto(request.queryParams("texto"));
            portalG1.changeState(noticia);

            Map<String, Object> model = new HashMap<>();
            Noticia noticiaRecebidaIgor = igor.getUltimaNoticia();
            Noticia noticiaRecebidaMarcio = marcio.getUltimaNoticia();
            model.put("igorNoticia", noticiaRecebidaIgor.toString());
            model.put("marcioNoticia", noticiaRecebidaMarcio.toString());
            return new ModelAndView(model, "output.html"); // hello.mustache file is in resources/templates directory
        }, new MustacheTemplateEngine());
    }

}
