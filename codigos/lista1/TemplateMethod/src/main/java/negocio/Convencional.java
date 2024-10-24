/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Convencional extends Frete {

    public Convencional(double peso, double desconto) {
        super(peso, desconto);
    }

    @Override
    public double modalidade() {
        return 1;
    }
    
}
