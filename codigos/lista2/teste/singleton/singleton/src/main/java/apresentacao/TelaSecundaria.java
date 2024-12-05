package apresentacao;

import negocio.ConfiguracaoUsuario;

public class TelaSecundaria {

    public TelaSecundaria(){
        System.out.println("Exibindo o idioma definido na tela anterior:");
        System.out.println(ConfiguracaoUsuario.getInstance().getIdioma());
        System.out.println(ConfiguracaoUsuario.getInstance().hashCode());

    }

}
