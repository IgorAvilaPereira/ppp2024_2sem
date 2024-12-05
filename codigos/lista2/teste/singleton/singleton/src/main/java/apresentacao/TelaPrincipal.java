package apresentacao;

import java.util.Scanner;

import negocio.ConfiguracaoUsuario;

public class TelaPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Idioma");
        String idioma = entrada.nextLine();
        System.out.println("Definindo o idioma:");
        ConfiguracaoUsuario.getInstance().setIdioma(idioma);
        System.out.println(ConfiguracaoUsuario.getInstance().hashCode());
        entrada.close();
        new TelaSecundaria();
    }
}