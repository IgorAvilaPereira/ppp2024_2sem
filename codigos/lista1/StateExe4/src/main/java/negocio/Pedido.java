/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author iapereira
 */
public class Pedido  {
    private UUID id;
    private LocalDate data;
    private double total;
    
    private Estado estadoAtual;
    
    public Pedido(){
        this.id = UUID.randomUUID();
        this.data = LocalDate.now();
        this.estadoAtual = new PedidoRecebido();
        this.total = 0;

    }

    public void progresso(){
        this.estadoAtual = this.estadoAtual.proximoEstado();
    }
    
    public void regresso(){
        this.estadoAtual = this.estadoAtual.estadoAnterior();
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", data=" + data + ", total=" + total + ", estadoAtual=" + estadoAtual.getClass().getSimpleName() + '}';
    }
    
    
    
}
