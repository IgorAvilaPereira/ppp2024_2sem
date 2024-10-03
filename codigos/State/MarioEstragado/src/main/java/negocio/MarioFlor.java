/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MarioFlor implements MarioState {

    @Override
    public MarioState cogumelo() {
        return this;
    }

    @Override
    public MarioState pena() {
        return new MarioPena();
    }

    @Override
    public MarioState flor() {
        return this;
    }

    @Override
    public MarioState dano(Mario mario) {
//        return new MarioGrande();
          return MarioGrande.getInstance();
    }
    
}
