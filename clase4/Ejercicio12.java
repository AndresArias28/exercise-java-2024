package clase4;

import java.util.Scanner;

/*ecesitamos convertir una cantidad de segundos ingresada por el usuario en días, horas, minutos y segundos. */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de segundos: ");
        int segundos = scanner.nextInt();
        convertirSegundos(segundos);
        scanner.close();
    }

    public static void convertirSegundos(int segundos) {
        int dias = segundos / 86400;
        int horas = (segundos % 86400) / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosRestantes);
    }
}
