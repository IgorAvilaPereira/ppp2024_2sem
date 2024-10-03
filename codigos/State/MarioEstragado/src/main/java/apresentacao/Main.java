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
        System.out.println(mario.getVidas());
        mario.pegarCogumelo();
        System.out.println(mario.getEstado().hashCode());
        mario.levarDano();
        mario.pegarCogumelo();
        System.out.println(mario.getEstado().hashCode());
        System.out.println(mario.getEstado().getClass().getSimpleName());
        System.out.println(mario.getVidas());
    }
}
