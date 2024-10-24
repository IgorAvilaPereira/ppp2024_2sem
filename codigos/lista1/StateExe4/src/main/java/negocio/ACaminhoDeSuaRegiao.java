/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class ACaminhoDeSuaRegiao implements Estado {

    @Override
    public Estado proximoEstado() {
        return new PedidoEntregue();
    }

    @Override
    public Estado estadoAnterior() {
        return new NotaFiscalDisponivel();
    }
    
}
