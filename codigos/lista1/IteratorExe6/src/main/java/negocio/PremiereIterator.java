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
public class PremiereIterator implements Iterator<Canal> {

    private final Premiere premiere;
    private int pos;
    
    public PremiereIterator(Premiere premiere){
        this.premiere = premiere;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return this.pos < this.premiere.getVetCanais().size();
    }

    @Override
    public Canal next() {
        Canal c = this.premiere.getVetCanais().get(pos);
        pos++;
        return c;
    }
    
}
