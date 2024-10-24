/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Pessoa;
import negocio.Telefone;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Pessoa igor = new Pessoa("Igor");
        Pessoa david = new Pessoa("David");
        Telefone telefone = new Telefone();
        telefone.registerObserver(igor);
        telefone.registerObserver(david);
        telefone.changeState("gravando mensagem");
    }
}
