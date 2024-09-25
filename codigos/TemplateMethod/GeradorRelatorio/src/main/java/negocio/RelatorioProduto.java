/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class RelatorioProduto extends Relatorio {

    @Override
    protected void exibirCabecalho() {
        System.out.println("Relatorios da Empresa x - Produtos");
    }
    
    @Override
    protected void exibirConteudo() {
        System.out.println("Produto 1");
        System.out.println("Produto 2");
        System.out.println("Produto 3");
    }
    
}
