/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.DuckBorracha;
import negocio.DuckFaberCastell;
import negocio.DuckRed;
import negocio.FlyNoWay;
import negocio.MuteQuack;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        
        DuckBorracha borracha1 = new DuckBorracha(1, 0.5);
        borracha1.performQuack();
        System.out.println("perdi a pecinha que faz barulho!!");
        borracha1.setQuackBehavior(new MuteQuack());
        borracha1.performQuack();
        
        
        System.out.println("==========pato de verdade (red)===============");
        
        DuckRed cabRed1 = new DuckRed(2, 0.7);
        cabRed1.performFly();
        cabRed1.performQuack();
        System.out.println("Levou um tiro");
        cabRed1.setFlyBehavior(new FlyNoWay());
        cabRed1.performFly();
        cabRed1.performQuack();
        System.out.println("Levou um tiro na garganta");
        cabRed1.setQuackBehavior(new MuteQuack());
        cabRed1.performFly();
        cabRed1.performQuack();
        
        
        System.out.println("==============Exemplo faber castell");
        DuckFaberCastell faberCastell = new DuckFaberCastell();
        faberCastell.display();

    }
    
    
}
