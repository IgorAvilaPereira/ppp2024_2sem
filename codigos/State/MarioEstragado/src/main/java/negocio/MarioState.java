/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public interface MarioState {
    public MarioState cogumelo();
    public MarioState pena();
    public MarioState flor();
    public MarioState dano(Mario mario);
    
    
}
