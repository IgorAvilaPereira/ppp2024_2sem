/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Copiar implements Command {
    
    private final Documento documento;
    
    public Copiar(Documento documento){
        this.documento = documento;
    }

    @Override
    public void execute() {
        System.out.println("EStou copiando o documento"+this.documento.getNome());
    }

    @Override
    public void undo() {
        System.out.println("Desfazendo o copiando...");
    }
    
}
