/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Relatorio {

//  templateMethod
    public final void gerarRelatorio() {        
//      primitiveOperations
        exibirCabecalho();  // imutavel
        exibirConteudo(); // mutavel => sob responsabilidade das minhas subclasses (classes filhas)
        exibirRodape();  // imutavel      
        
    }

    protected void exibirCabecalho() {
        System.out.println("Relatorios da Empresa x");
    }

    protected abstract void exibirConteudo();

    private void exibirRodape() {
        System.out.println("Endereço: Alfredo Huch, cep: 96202188, telefone contato: (53) 999999 email:igor.pereira@riogrande.ifrs.edu.br");
    }

}
