/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import negocio.OrdenacaoDecrescente;
import negocio.OrdenacaoCrescente;
import negocio.Vetor;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        int v[] = {2, 1, 3, 6, 5};
        Vetor vetor = new Vetor(v);  

        System.out.println("Mostrando vetor ordenado:");
        vetor.setEstrategia(new OrdenacaoCrescente());
        vetor.executaEstrategia();
        vetor.mostra();
        
        System.out.println("Mostrando vetor ordenado descrescente:");
        vetor.setEstrategia(new OrdenacaoDecrescente());  
        vetor.executaEstrategia();
        vetor.mostra();
    }
}
