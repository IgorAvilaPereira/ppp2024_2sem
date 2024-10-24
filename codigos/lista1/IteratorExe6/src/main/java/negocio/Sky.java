/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author iapereira
 */
public class Sky {
    private Map<Integer, Canal> vetCanais;
    
    public Sky(){
        
        Canal disneyChannel = new Canal("espn", 32);
        Canal nickelodeon = new Canal("sportv", 539);
        
        this.vetCanais = new HashMap<>();
        this.vetCanais.put(0, disneyChannel);
        this.vetCanais.put(1, nickelodeon);
        
    }

    public Map<Integer, Canal> getVetCanais() {
        return vetCanais;
    }

    public void setVetCanais(Map<Integer, Canal> vetCanais) {
        this.vetCanais = vetCanais;
    }
    
    
}
