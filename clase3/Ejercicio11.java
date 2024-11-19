package clase3;

import java.util.Scanner;

/*Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.  
Por ejemplo: */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa 3 numeros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int menor;
        int  mediano;
        int mayor;
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                mediano = n2;
                mayor = n3;
            } else {
                mediano = n3;
                mayor = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                mediano = n1;
                mayor = n3;
            } else {
                mediano = n3;
                mayor = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                mediano = n1;
                mayor = n2;
            } else {
                mediano = n2;
                mayor = n1;
            }
        }

        // Imprimir los resultados
        System.out.println("Menor: " + menor);
        System.out.println("Mediano: " + mediano);
        System.out.println("Mayor: " + mayor);
    }
}
