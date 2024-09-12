/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.InterfaceDeOrdenacao;

/**
 *
 * @author iapereira
 */
public class OrdenacaoDecrescente implements InterfaceDeOrdenacao {

    @Override
    public void ordena(int[] vetor) {
        System.out.println("descrescente...");
        int aux;
        for (int i = vetor.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }
}
