import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    ArrayList<Card> baraja = new ArrayList<Card>();


    public void initiateGame() {
        baraja.clear();
        for (int i = 0; i <= 52; i++) {
            Card card = new Card(i);
            baraja.add(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(baraja);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!baraja.isEmpty()) {
            Card card = baraja.get(0);
            System.out.println(card.getPalo() + ", " + card.getColor() + ", " + card.getValor());
            baraja.remove(0);
            System.out.println("Quedan " + baraja.size() + " cartas en el deck");
        } else {
            System.out.println("Hay insuficientes cartas en el deck");
        }
    }

    public void pick() {
        if (!baraja.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(baraja.size());
            Card card = baraja.get(index);
            System.out.println(card.getPalo() + ", " + card.getColor() + ", " + card.getValor());
            baraja.remove(index);
            System.out.println("Quedan " + baraja.size() + " cartas en el deck");
        } else {
            System.out.println("Hay insuficientes cartas en el deck");
        }
    }

    public void hand() {
        if (baraja.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Random random = new Random();
                int index = random.nextInt(baraja.size());
                Card card = baraja.get(index);
                System.out.println(card.getPalo() + ", " + card.getColor() + ", " + card.getValor());
                baraja.remove(index);
            }
            System.out.println("Quedan " + baraja.size() + " cartas en el deck");
        } else {
            System.out.println("No hay suficientes cartas en el deck para una mano completa");
        }
    }
}
