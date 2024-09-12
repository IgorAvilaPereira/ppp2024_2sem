/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Duck {
    protected double peso;
    protected double altura;    
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    
    public void swim(){
        System.out.println("Nadando satolep....");
    }
    
    public void performQuack(){
        this.quackBehavior.quack();
        
    }
    
    public void performFly(){
        this.flyBehavior.fly();
        
    }
      

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public void display(){
        System.out.println(this.getClass().getSimpleName());
        this.performFly();
        this.performQuack();
    }

    
    
}
