/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Frete {    

    private double peso;
    private double desconto;
    
    public Frete(double peso, double desconto){
        this.peso = peso;
        this.desconto = desconto;
    }
    
    private double peso(){
        return 1*this.peso;
    }
    
    private double desconto(){
        return this.desconto;
    }
    
    
    public final double freteTotal(){
        return (this.modalidade() + this.peso()) - this.desconto();
    }
    
    protected abstract double modalidade();
    
    
    
}
