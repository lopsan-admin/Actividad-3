import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    public static void main(String[] args)
    {
        Card card = new Card();

        System.out.println("Deck de Cartas para Iniciar:");
        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < card.valor.length; i++) {
            for (int j = 0; j < card.palo.length; j++) {
                deck.add(card.palo[j]+ " " + card.color[0] + " " + card.valor[i]);
                deck.add(card.palo[j]+ " " + card.color[1] + " " + card.valor[i]);
            }
        }

        for (String elemento : deck) {
            System.out.print(elemento + " / ");
        }
        System.out.println("\n");
        suflle(deck);
        System.out.println("\n");
        head(deck);
        System.out.println("\n");
        pick(deck);
        System.out.println("\n");
        hand(deck);
    }

    public static void suflle(ArrayList deck){
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.");
        for (Object elemento : deck) {
            System.out.print(elemento + " / ");
        }
    }

    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public static void pick(ArrayList  deck){
        Random random = new Random();
        System.out.println(deck.get(random.nextInt(deck.size())));
        deck.remove(random.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public static void hand(ArrayList deck){
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
}
