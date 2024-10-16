/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import java.sql.SQLException;
import negocio.CardapioCarnivoroIterator;
import java.util.ArrayList;
import java.util.Iterator;
import negocio.CardapioVegetarianoInverterIterator;
import negocio.CardapioVegetarianoIterator;
import negocio.MenuItem;
import persistencia.MenuItemDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        ArrayList<MenuItem> cardapioVegetariano = new ArrayList();

        MenuItem pratoAnaClara = new MenuItem();
        pratoAnaClara.setDescricao("hamburguer de grão de bico");
        pratoAnaClara.setPreco(27);
        pratoAnaClara.setEhVegetariano(true);
        pratoAnaClara.setNome("hamburger a la ana clara");

        MenuItem pratoJP = new MenuItem();
        pratoJP.setDescricao("BATATA FRITA");
        pratoJP.setPreco(1.99);
        pratoJP.setEhVegetariano(true);
        pratoJP.setNome("BATATA DO JP");

        cardapioVegetariano.add(pratoAnaClara);
        cardapioVegetariano.add(pratoJP);

        CardapioVegetarianoIterator iteratorVegetariano = new CardapioVegetarianoIterator(cardapioVegetariano);
        CardapioVegetarianoInverterIterator iteratorInverterVegetariano = new CardapioVegetarianoInverterIterator(cardapioVegetariano);

        printIterator(iteratorVegetariano);
        System.out.println("=========inverter==============");
        printIterator(iteratorInverterVegetariano);
        System.out.println("=========inverter==============");

        MenuItem cardapioCarnivoro[] = new MenuItem[10];
        MenuItem brunoBife = new MenuItem();
        brunoBife.setDescricao("carne bem preparada (mal passada)");
        brunoBife.setNome("bife ala minuta do bruno");
        brunoBife.setEhVegetariano(false);
        brunoBife.setPreco(10);
        cardapioCarnivoro[0] = brunoBife;

        CardapioCarnivoroIterator iteratorCarnivoro = new CardapioCarnivoroIterator(cardapioCarnivoro);
        printIterator(iteratorCarnivoro);

        MenuItemDAO menuItemDAO = new MenuItemDAO();
        printIterator(menuItemDAO.listar().iterator());

    }

    private static void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
