import java.util.ArrayList;

public class Card {

            ArrayList<String> deck = new ArrayList<String>();

            String[] palo = {"trébol", "corazones", "picas", "diamantes"};
            String[] color = {"rojo", "negro"};
            String[] valor = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K" };

            int deckSize = palo.length * color.length * valor.length;
}


