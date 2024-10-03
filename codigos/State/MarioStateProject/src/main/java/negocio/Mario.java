/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Mario {
    
    private int vidas;
    private int moedas;
    private String fase;
    private String mundo;
    
    private MarioState estado;
    
    public Mario(){
        this.estado = new MarioPequeno();
        this.vidas = 100;
        this.moedas = 50;
    }
    
    
    public void pegarCogumelo(){
        this.estado = this.estado.cogumelo();
    }
    
    public void pegarPena(){
        this.estado = this.estado.pena();
    }
    
    public void levarDano(){
        this.estado = this.estado.dano();
    }
    
    public void pegarFlor(){
        this.estado = this.estado.flor();
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getMundo() {
        return mundo;
    }

    public void setMundo(String mundo) {
        this.mundo = mundo;
    }

    public MarioState getEstado() {
        return estado;
    }

    public void setEstado(MarioState estado) {
        this.estado = estado;
    }
   
    
    
    
    
    
}
