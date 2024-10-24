/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import negocio.Canal;

/**
 *
 * @author iapereira
 */
public class Premiere {

    private List<Canal> vetCanais;
    
    public Premiere(){
        Canal espn = new Canal("espn", 32);
        Canal sportTv = new Canal("sportv", 539);
        
        this.vetCanais = new ArrayList();
        this.vetCanais.add(espn);
        this.vetCanais.add(sportTv);
    }

    public List<Canal> getVetCanais() {
        return vetCanais;
    }

    public void setVetCanais(List<Canal> vetCanais) {
        this.vetCanais = vetCanais;
    }
    
    
    
}
