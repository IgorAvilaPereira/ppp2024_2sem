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
public class Main1 {

    public static void main(String[] args) {
        ArrayList<MenuItem> cardapioVegetariano = new ArrayList();
        MenuItem pratoAnaClara = new MenuItem();
        pratoAnaClara.setDescricao("hamburguer de grão de bico");
        pratoAnaClara.setPreco(27);
        pratoAnaClara.setEhVegetariano(true);
        pratoAnaClara.setNome("hamburger a la ana clara");
        cardapioVegetariano.add(pratoAnaClara);
        CardapioVegetarianoIterator iteratorVegetariano = new CardapioVegetarianoIterator(cardapioVegetariano);
        printIterator(iteratorVegetariano);

        MenuItem cardapioCarnivoro[] = new MenuItem[10];
        MenuItem brunoBife = new MenuItem();
        brunoBife.setDescricao("carne bem preparada (mal passada)");
        brunoBife.setNome("bife ala minuta do bruno");
        brunoBife.setEhVegetariano(false);
        brunoBife.setPreco(10);
        cardapioCarnivoro[0] = brunoBife;

        CardapioCarnivoroIterator iteratorCarnivoro = new CardapioCarnivoroIterator(cardapioCarnivoro);
        printIterator(iteratorCarnivoro);
               
    }

    private static void printIterator(IteratorDoIgor iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
