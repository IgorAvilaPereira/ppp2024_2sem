/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DuckRed extends Duck {
    
    public DuckRed(double peso, double altura){
        this.altura = altura;
        this.peso = peso;
        
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    
}
