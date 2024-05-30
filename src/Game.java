import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Game {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int seleccion = 0;

        Deck baraja = new Deck();
        baraja.initiateGame();
        System.out.println("Bienvenidos al juego de Poker");
        System.out.println("Selecionar la accion");
        mostrarMenu();
        seleccion = parseInt(read.readLine());

            while (seleccion < 5){
                switch (seleccion) {
                    case 1:
                        baraja.shuffle();
                        mostrarMenu();
                        seleccion = parseInt(read.readLine());
                        break;
                    case 2:
                        baraja.head();
                        mostrarMenu();
                        seleccion = parseInt(read.readLine());
                        break;
                    case 3:
                        baraja.pick();
                        mostrarMenu();
                        seleccion = parseInt(read.readLine());

                        break;
                    case 4:
                        baraja.hand();
                        mostrarMenu();
                        seleccion = parseInt(read.readLine());

                        break;
                }
            }
        }




    public static void mostrarMenu() {
        System.out.println("1. Mezclar Deck");
        System.out.println("2. Mostrar la primera Carta");
        System.out.println("3. Seleccionar una carta al azar");
        System.out.println("4. Sacar una mano completa");
    }
}
