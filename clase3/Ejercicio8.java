package clase3;

import java.util.Scanner;

/*Escriba un programa que permita ingresar un número (va a representar la cantidad de años) y de como respuesta la etapa en la que se encuentra la persona de acuerdo con la siguiente tabla. */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("Primera Infancia");
        } else if (edad >= 6 && edad <= 12) {
            System.out.println("Infancia");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Adolescencia"); 
        } else if (edad >= 19 && edad <= 26) {
            System.out.println("Juventud");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("Adultez");
        } else if (edad >= 60) {
            System.out.println("Vejez");
        } else {
            System.out.println("Edad no válida");
        }
    }
}
