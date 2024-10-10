/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;
import persistencia.PessoaDAO;

/**
 *
 * @author iapereira
 */
public class ListarCommand extends Command {
    private PessoaDAO pessoaDAO;

    public ListarCommand() {
        this.pessoaDAO = new PessoaDAO();
    }

    @Override
    public String execute() {
        String output = "";
        ArrayList<Pessoa> vet = this.pessoaDAO.listar();
        for (int i = 0; i < vet.size(); i++) {
           output += vet.get(i).toString();
            
        }
        return output;
    }
    
}
