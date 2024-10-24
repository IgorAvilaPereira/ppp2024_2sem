/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import java.util.Iterator;
import negocio.Premiere;
import negocio.Canal;
import negocio.PremiereIterator;
import negocio.Sky;
import negocio.SkyIterator;

/**
 *
 * @author iapereira
 */
public class IteratorExe6 {

    public static void main(String[] args) {
        
    
        
        Premiere premiere = new Premiere();
        Sky sky = new Sky();
        
        SkyIterator skyIterator = new SkyIterator(sky);
        PremiereIterator premiereIterator = new PremiereIterator(premiere);
        
        printCanal(skyIterator);
        printCanal(premiereIterator);
        
    }

    private static void printCanal(Iterator iterator) {
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
