package clase3;

import java.util.Scanner;

/*
 Escriba un programa que permita ingresar un número e identificar si es par o impar.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
            
        }
    }
    
}
