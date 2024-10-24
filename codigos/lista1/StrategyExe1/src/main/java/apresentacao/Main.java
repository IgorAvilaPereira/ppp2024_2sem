/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.CartuchoSnes;
import negocio.PromocaoChuva;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        
        CartuchoSnes topGear = new CartuchoSnes();
        topGear.setAnoLancamento(1995);
        topGear.setNome("cartucho top gear");
        topGear.setPreco(100);        
//        topGear.setPromocao(new PromocaoChuva());        
        System.out.println(topGear.calcPreco());
               
        
    }
}
