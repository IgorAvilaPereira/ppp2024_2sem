package apresentacao;

import negocio.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        // ContaCorrente contaCorrente = new ContaCorrente(null, 0, 0, 0, 0, null, null);

        ContaCorrente contaCorrente = new ContaCorrente.Builder().nomeTitular("Igor").build();
        System.out.println(contaCorrente);

    }
}