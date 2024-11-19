package clase3;

import java.util.Scanner;
/*+Escriba un programa que permita ingresar un número mientras estos sean negativos. Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad de números negativos ingresados. */

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        do {
            System.out.println("ingresa un numero negativo:");
            num = scanner.nextInt();
            if (num < 0) {
                cont = cont + 1;
            }
            
        } while (num < 0);
        System.out.println("Los numeros negativos ingresados son: " + cont);
        
    }
}