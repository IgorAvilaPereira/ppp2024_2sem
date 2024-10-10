/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pessoa {
    private int id;
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
                
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "<table border='1'><tr> <td> "+this.id + " </td> <td>" + nome + "</td> </tr> </table>";
    }
 
    
    
}
