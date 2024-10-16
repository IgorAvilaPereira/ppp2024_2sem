/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author iapereira
 */
public class CardapioVegetarianoInverterIterator implements Iterator<MenuItem> {

    private ArrayList<MenuItem> cardapio;
    private int pos;
    
    public CardapioVegetarianoInverterIterator(ArrayList<MenuItem> cardapio){
        this.cardapio = cardapio;
        this.pos = this.cardapio.size()-1;
    }

    @Override
    public boolean hasNext() {
        return this.pos >= 0;
    }

    @Override
    public MenuItem next() {
        if (this.hasNext()){
            MenuItem item = this.cardapio.get(pos);
            pos--;
            return item;
        }
        return null;
    }
    
}
