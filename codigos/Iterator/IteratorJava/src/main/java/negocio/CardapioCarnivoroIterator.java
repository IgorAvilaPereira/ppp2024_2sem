/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Iterator;

/**
 *
 * @author iapereira
 */
public class CardapioCarnivoroIterator implements Iterator<MenuItem> {

    private MenuItem[] cardapio;
    private int pos;

    public CardapioCarnivoroIterator(MenuItem[] cardapio) {
        this.cardapio = cardapio;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {     
        return (this.pos < this.cardapio.length) && (this.cardapio[pos] != null);
    }

    @Override
    public MenuItem next() {
        if (this.hasNext()){
            MenuItem item = this.cardapio[pos];
            pos++;
            return item;
            
        }
        return null;
    }
    
}
