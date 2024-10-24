/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Sedex extends Frete {

    public Sedex(double peso, double desconto) {
        super(peso, desconto);
    }

    @Override
    public double modalidade() {
        return 100;
    }
    
}
