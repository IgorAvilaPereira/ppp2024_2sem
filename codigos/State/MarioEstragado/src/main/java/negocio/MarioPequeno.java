/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MarioPequeno implements MarioState {

    @Override
    public MarioState cogumelo() {
      return MarioGrande.getInstance();
    }

    @Override
    public MarioState pena() {
        return new MarioPena();
    }

    @Override
    public MarioState flor() {
        return new MarioFlor();
    }

    @Override
    public MarioState dano(Mario mario) {
        mario.setVidas(mario.getVidas()-1);
        return new MarioMorto();
    }
    
}
