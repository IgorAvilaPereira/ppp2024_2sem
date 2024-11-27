/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Pizza;
import negocio.PizzaBuilder;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        
//        Pizza pizza = new Pizza(10, true, false, false, true);
        
        Pizza pizzaB = new PizzaBuilder().tamanho(10).queijo(true).build();
        System.out.println(pizzaB);
    }
    
}
