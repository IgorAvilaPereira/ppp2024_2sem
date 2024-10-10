/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import negocio.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class PessoaDAO {
    
    public ArrayList<Pessoa> listar(){
        ArrayList<Pessoa> vet = new ArrayList<>();
        vet.add(new Pessoa("Igor"));
        vet.add(new Pessoa("marcio"));
        return vet;
        
             
    }
    
}
