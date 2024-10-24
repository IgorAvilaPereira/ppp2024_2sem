/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iapereira
 */
public class Telefone implements Subject {
    private List<Observer> vetObservers;
    private List<String> vetMensagens;
    
    public Telefone(){
        this.vetObservers = new ArrayList<>();   
        this.vetMensagens = new ArrayList<>();
    }
    
    public Telefone(List<Observer> vetObservers){
        this.vetObservers = vetObservers;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.vetObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.vetObservers.remove(observer);
    }

    @Override
    public void removeObserver(int i) {
        this.vetObservers.remove(i);
    }

    @Override
    public void notifyObservers() {
        
        for (int i = 0; i < vetObservers.size(); i++) {
            Observer observer = vetObservers.get(i);
            
            observer.update(this.vetMensagens.get(this.vetMensagens.size()-1));
           
        }
    }

    @Override
    public void changeState(String mensagem) {
        this.vetMensagens.add(mensagem);
        this.notifyObservers();
    }
    
}
