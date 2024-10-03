/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.Mario;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Mario mario = new Mario();
//        mario.levarDano();
        mario.pegarCogumelo();
        mario.pegarFlor();
        mario.levarDano();
        mario.levarDano();
        mario.pegarCogumelo();
        mario.levarDano();
        mario.pegarCogumelo();
        mario.levarDano(); // pequeno
        mario.pegarCogumelo(); // grande
        mario.levarDano(); // pequeno
        mario.pegarCogumelo();// grande
        System.out.println(mario.getEstado().getClass().getSimpleName());
    }
}
