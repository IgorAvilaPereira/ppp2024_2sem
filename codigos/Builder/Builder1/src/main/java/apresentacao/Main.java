/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Pizza;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        
//        Pizza pizza = new Pizza(10, true, true, true, true);
        
        Pizza pizzaB = new Pizza.PizzaBuilder(10).queijo().cebola().build();
    }
}
