/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class TvSamsung {
    private int polegadas;
    private String resolucao;
    private boolean estaLigada;


    public boolean isEstaLigada() {
        return estaLigada;
    }

    public TvSamsung() {
    }
    
    public void on(){
        this.estaLigada = true;
        System.out.println("TV LIGADA");
    }
    
    public void off(){
        this.estaLigada = false;
        System.out.println("TV DESLIGADA");

    }
    
}
