/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.OrdenacaoCrescente;
import negocio.InterfaceDeOrdenacao;

/**
 *
 * @author iapereira
 */
public class Vetor {

    private int vetor[];
    private InterfaceDeOrdenacao estrategia;

    public Vetor(int vetor[]) {
        this.vetor = vetor;
        this.estrategia = new OrdenacaoCrescente();

    }

    public void executaEstrategia() {
        this.estrategia.ordena(this.vetor);
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public InterfaceDeOrdenacao getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(InterfaceDeOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    
    public void mostra() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
