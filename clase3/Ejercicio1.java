package clase3;

import java.util.Scanner;

/*
 Escriba un programa que permita ingresar un número real e identifique si el
  número es negativo, positivo o cero.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double numero = scanner.nextDouble();
    
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }      
        scanner.close(); 
    }
}
