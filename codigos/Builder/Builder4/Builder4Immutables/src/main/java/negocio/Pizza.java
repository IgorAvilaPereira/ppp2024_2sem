package negocio;

import org.immutables.builder.Builder;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */

public class Pizza {
    private int tamanho;
    private boolean queijo;
    private boolean tomate;
    private boolean bacon;
    private boolean cebola;

    @Builder.Constructor
    public Pizza(int tamanho){
        this.tamanho = tamanho;
    }
    @Builder.Constructor
    public Pizza(int tamanho, boolean queijo, boolean tomate, boolean bacon, boolean cebola) {
        this.tamanho = tamanho;
        this.queijo = queijo;
        this.tomate = tomate;
        this.bacon = bacon;
        this.cebola = cebola;
    }
    
    

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tamanho=" + tamanho + ", queijo=" + queijo + ", tomate=" + tomate + ", bacon=" + bacon + ", cebola=" + cebola + '}';
    }

  
    
    

   
    
}
