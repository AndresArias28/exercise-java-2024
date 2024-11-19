package clase3;

import java.util.Scanner;

/*
 Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer número: ");

        double numero3 = scanner.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println( numero1 + " es el mayor.");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println( numero2 + " es el mayor.");
        } else {
            System.out.println( numero3 + " es el mayor.");
        }
    }

}
