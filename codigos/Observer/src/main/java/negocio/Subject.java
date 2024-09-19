/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
interface Subject {
    public void addSubscribe(Observer observer);
    public void removeSubscribe(Observer observer);
    public void removeSubscribe(int i);
    public void notifyObservers();
    public void changeState(Object object);
    
}
