/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.CardapioCarnivoroIterator;
import java.util.ArrayList;
import java.util.Iterator;
import negocio.CardapioVegetarianoIterator;
import negocio.IteratorDoIgor;
import negocio.MenuItem;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<MenuItem> cardapioVegetariano = new ArrayList();
        MenuItem pratoAnaClara = new MenuItem();
        pratoAnaClara.setDescricao("hamburguer de grão de bico");
        pratoAnaClara.setPreco(27);
        pratoAnaClara.setEhVegetariano(true);
        pratoAnaClara.setNome("hamburger a la ana clara");
        cardapioVegetariano.add(pratoAnaClara);

        CardapioVegetarianoIterator iteratorVegetariano = new CardapioVegetarianoIterator(cardapioVegetariano);
//       3)
        printIterator(iteratorVegetariano);

//        2)
//        while(iteratorVegetariano.hasNext()){
//            System.out.println(iteratorVegetariano.next());
//        }
//        1)
//        for (int i = 0; i < cardapioVegetariano.size(); i++) {
//            MenuItem item = cardapioVegetariano.get(i);            
//            System.out.println(item);
//            
//        }
        MenuItem cardapioCarnivoro[] = new MenuItem[10];
        MenuItem brunoBife = new MenuItem();
        brunoBife.setDescricao("carne bem preparada (mal passada)");
        brunoBife.setNome("bife ala minuta do bruno");
        brunoBife.setEhVegetariano(false);
        brunoBife.setPreco(10);
        cardapioCarnivoro[0] = brunoBife;

        CardapioCarnivoroIterator iteratorCarnivoro = new CardapioCarnivoroIterator(cardapioCarnivoro);
//      3)
        printIterator(iteratorCarnivoro);
//      2)
//          while(iteratorCarnivoro.hasNext()){
//            System.out.println(iteratorCarnivoro.next());
//        }
//       1)
//        for(int i = 0; i < cardapioCarnivoro.length; i++){
//            if (cardapioCarnivoro[i] != null) System.out.println(cardapioCarnivoro[i]);
//        }
//                
    }

    private static void printIterator(IteratorDoIgor iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
