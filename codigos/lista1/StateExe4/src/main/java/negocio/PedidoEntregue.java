/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PedidoEntregue implements Estado {

    @Override
    public Estado proximoEstado() {
        return this;
    }

    @Override
    public Estado estadoAnterior() {
        return new ACaminhoDeSuaRegiao();
    }
    
}
