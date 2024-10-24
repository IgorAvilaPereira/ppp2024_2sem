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
public class SkyIterator implements Iterator<Canal>{

    private final Sky sky;
    private int pos;
    
    public SkyIterator(Sky sky){
        this.sky = sky;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
       return this.pos < this.sky.getVetCanais().size();
    }

    @Override
    public Canal next() {
        Canal c = this.sky.getVetCanais().get(this.pos);
        pos++;
        return c;
    }
    
}
