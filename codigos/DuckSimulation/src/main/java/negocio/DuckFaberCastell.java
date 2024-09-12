/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DuckFaberCastell extends Duck {
    
    public DuckFaberCastell() {
       this.peso = 1;
       this.altura = 1;
       
       this.flyBehavior = new FlyWithWings();
       this.quackBehavior = new Quack();
    }
    
}
