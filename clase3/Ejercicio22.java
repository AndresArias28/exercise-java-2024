package clase3;

import java.util.Scanner;

/*Realizar un programa que permita controlar el juego de piedra, papel, tijera  introduciendo P para piedra, L para papel y T para tijera por cada jugador.  
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final de cada ronda preguntar si desea volver a jugar. */
public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String jugador1 = "";
        String jugador2 = "";
        String resultado = "";
        do {
            System.out.println(" jugador 1 (Piedra, Papel o Tijera):");
            jugador1 = scanner.nextLine();
            System.out.println(" jugador 2 (Piedra, Papel o Tijera):");
            jugador2 = scanner.nextLine();

            if (jugador1.equals(jugador2)) {
                resultado = "Empate";
            } else if ((jugador1.equals("Piedra") && jugador2.equals("Tijera"))
                    || (jugador1.equals("Papel") && jugador2.equals("Piedra"))
                    || (jugador1.equals("Tijera") && jugador2.equals("Papel"))) {
                resultado = "gsns jugador 1";
            } else {
                resultado = "gana jugador 2";
            }

            System.out.println("resultado: " + resultado);
            System.out.println(" volver a jugar (S/N)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);
        scanner.close();
    }
}
