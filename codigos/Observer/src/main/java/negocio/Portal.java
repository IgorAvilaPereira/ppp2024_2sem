/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Portal implements Subject {
    private ArrayList<Observer> vetUsuario;
    private ArrayList<Noticia> vetNoticia;
    
    public Portal(){
        this.vetNoticia = new ArrayList<>();
        this.vetUsuario = new ArrayList<>();
    }
    

    public ArrayList<Observer> getVetUsuario() {
        return vetUsuario;
    }

    public void setVetUsuario(ArrayList<Observer> vetUsuario) {
        this.vetUsuario = vetUsuario;
    }

    public ArrayList<Noticia> getVetNoticia() {
        return vetNoticia;
    }

    public void setVetNoticia(ArrayList<Noticia> vetNoticia) {
        this.vetNoticia = vetNoticia;
    }
    
    

    @Override
    public void addSubscribe(Observer observer) {
        this.vetUsuario.add(observer);
    }

    @Override
    public void removeSubscribe(Observer observer) {
        this.vetUsuario.remove(observer);
    }

    @Override
    public void removeSubscribe(int i) {
        this.vetUsuario.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < vetUsuario.size(); i++) {
            Observer usuario = vetUsuario.get(i);
            usuario.update(this);
        }
    }

    @Override
    public void changeState(Object object) {
        Noticia noticia = (Noticia) object;
        this.vetNoticia.add(noticia);
        this.notifyObservers();
    }
    
    
//        public void addNoticia(Noticia noticia){
//        this.vetNoticia.add(noticia);
//        this.notifyObservers();
//    }

    
    
}
