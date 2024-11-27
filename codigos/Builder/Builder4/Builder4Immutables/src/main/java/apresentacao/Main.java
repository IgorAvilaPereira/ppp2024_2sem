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
        Pizza p = new PizzaBuilder().tamanho(10).build();
        System.out.println(p);
    }
}
