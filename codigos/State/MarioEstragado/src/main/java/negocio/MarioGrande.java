/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MarioGrande implements MarioState {
    private static final MarioGrande INSTANCE = new MarioGrande();
    
    
    private MarioGrande(){
        
    }

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
        return new MarioFlor();
    }

    @Override
    public MarioState dano(Mario mario) {
        return new MarioPequeno();
    }
    
    public static MarioGrande getInstance(){
        return MarioGrande.INSTANCE;
    }
    
}
