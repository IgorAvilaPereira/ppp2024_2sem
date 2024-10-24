/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pessoa implements Observer {

    private final String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("Eu "+this.nome+" recebi uma mensagem no meu telefone fixo:"+mensagem);
    }
    
    
}
