/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DuckBorracha extends Duck {
    
    public DuckBorracha(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
        
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
        
    }
    
    
  
    
}
