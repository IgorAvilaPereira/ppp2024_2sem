package apresentacao;

import negocio.*;

public class Main {
    public static void main(String[] args) {
        Cargo exemplo = new Auxiliar();
        exemplo = new Prefeito(exemplo);

        System.out.println(exemplo.getDescricao());
        System.out.println(exemplo.salario());

        System.out.println("=====");

        Cargo exemplo2 = new Especialista();
        exemplo2 = new Prefeito(exemplo2);
        exemplo2 = new Secretario(exemplo2);
        System.out.println(exemplo2.getDescricao());
        System.out.println(exemplo2.salario());


    }
}