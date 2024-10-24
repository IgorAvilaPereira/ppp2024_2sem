/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Frete;
import negocio.Sedex;

/**
 *
 * @author iapereira
 */
public class TemplateMethod {

    public static void main(String[] args) {
        
        Frete sedex = new Sedex(100, 7);
        System.out.println(sedex.freteTotal()); 
    }
}
