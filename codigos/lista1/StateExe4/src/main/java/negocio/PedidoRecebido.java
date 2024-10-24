/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PedidoRecebido implements Estado {

    @Override
    public Estado proximoEstado() {
        return new PagamentoAprovado();
    }

    @Override
    public Estado estadoAnterior() {
        throw new IllegalArgumentException("deu xabum no pedido");
    }
    
}
