/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.RelatorioCliente;
import negocio.RelatorioFuncionario;
import negocio.RelatorioProduto;

/**
 *
 * @author iapereira
 */
public class GeradorRelatorio {

    public static void main(String[] args) {
        RelatorioFuncionario relatorioFuncionario = new RelatorioFuncionario();
        relatorioFuncionario.gerarRelatorio();
        
        
        RelatorioProduto relatorioProduto = new RelatorioProduto();
        relatorioProduto.gerarRelatorio();
        
        
        RelatorioCliente relatorioCliente = new RelatorioCliente();
        relatorioCliente.gerarRelatorio();
        
        System.out.println("============");        
        relatorioCliente.gerarRelatorio();
        
    }
}
