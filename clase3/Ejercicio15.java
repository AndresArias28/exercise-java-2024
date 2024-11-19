package clase3;

import java.util.Scanner;

/*Escriba un programa en el que ingrese un número y le diga si es positivo o negativo. Repita el proceso hasta que se ingrese el número cero. */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            System.out.println("ingrese un número: ");
            numero = input.nextInt();
            if (numero > 0) {
                System.out.println("numero es positivo");
            } else if (numero < 0) {
                System.out.println("numero es negativo");
            } else {
                System.out.println("numero es cero");
            }
        }
    }
   
}
