/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Beverage;
import negocio.Espresso;
import negocio.Milk;
import negocio.Sugar;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Beverage bebida1 = new Espresso();
        bebida1 = new Sugar(bebida1);
        bebida1 = new Sugar(bebida1);
        bebida1 = new Sugar(bebida1);
        bebida1 = new Sugar(bebida1);
        bebida1 = new Sugar(bebida1);
        bebida1 = new Milk(bebida1);
        System.out.println(bebida1.getDescription());
        System.out.println(bebida1.cost());
        bebida1 = bebida1.removeItem();
        System.out.println("=============");
        System.out.println(bebida1.getDescription());
        System.out.println(bebida1.cost());
        
        
    }
}
