/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class OrdenacaoCrescente implements InterfaceDeOrdenacao {

    @Override
    public void ordena(int[] vetor) {
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for (int j = i +1 ; j < vetor.length; j++){
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }
    
}
