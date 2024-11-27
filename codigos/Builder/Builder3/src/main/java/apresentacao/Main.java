/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Configuracao;
import negocio.Pizza;
import negocio.Pizza;
import negocio.Pizza;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        
       Pizza p = Pizza.builder().bacon(true).build();
        
//        Pizza pizza = new Pizza(10, true, false, false, true);
        
//        Pizza pizzaB = new PizzaBuilder().tamanho(10).queijo(true).build();
       System.out.println(p.isBacon());
       
       
       Configuracao conf = Configuracao.getInstance();
       conf.setIdioma("pt-br");
       
       Configuracao conf2 = Configuracao.getInstance();
       conf.setUsername("iapereira");
       
        System.out.println(conf2.getIdioma() + ":"+conf2.getUsername());
    
        System.out.println(conf.hashCode());
        System.out.println(conf2.hashCode());
    }
    
}
