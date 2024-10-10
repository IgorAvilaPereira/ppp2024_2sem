/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class HomeTheater {
    private int potencia;
    private int voltagem;
    private String marca;
    private int qtdeSpeakers;
    private int qtdeSubwoofers;
    private int volume;
    private boolean ativa71;
    
    public String ligar(){
        return "liguei";
    }
    
    public String desligar(){
        return "desliguei";
    }
    
    
    public void modoCinema(){
        this.ligar();
        this.volume = 100;
        this.ativa71 = true;
        System.out.println("modo cinema ativado");
        
    }
    
    
    
}
