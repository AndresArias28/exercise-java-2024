package clase3;

import java.util.Scanner;
/*
 Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letraIngresada = scanner.nextLine();

        if (letraIngresada.length() == 1) {

            char letra = Character.toLowerCase(letraIngresada.charAt(0)); // Convertimos a minúscula

            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(" es una vocal.");
                } else {
                    System.out.println( " es una consonante.");
                }
            } else {
                System.out.println("Por favor, ingresa solo una letra.");
            }
        } else {
            System.out.println("Por favor, ingresa solo una letra.");
        }

        scanner.close();

    }
    // else if (letraIngresada == 'a' || letraIngresada == 'e' || letraIngresada ==
    // 'i' || letraIngresada == 'o' || letraIngresada == 'u') {
    // System.out.println("La letra es vocal.");
    // } else {
    // System.out.println("La letra es consonante.");
    // }
}
