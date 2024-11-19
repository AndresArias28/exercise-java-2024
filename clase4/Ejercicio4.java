package clase4;

import java.util.Scanner;

/*Crear un método separado que realice la verificación de si un número es primo. */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        calcularPrimo(numero);
    }

    private static void calcularPrimo(int numero) {
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("El número" + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }

}
