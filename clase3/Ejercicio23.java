package clase3;

import java.util.Scanner;

/* Realizar un programa que imprima un diamante usando caracteres de texto. El programa debe pedir al usuario el tamaño del diamante, el cual debe ser un número entero positivo impar. 
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del diamante: ");
        int tamano = scanner.nextInt();
        // int tamano = 5;
        int espacios = tamano / 2;
        int asteriscos = 1;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < espacios; j++) {//imprime los espacios
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < tamano / 2) { //verifica si es la mitad superior
                espacios--;
                asteriscos += 2;
            } else { //verifica si es la mitad inferior
                espacios++;
                asteriscos -= 2;
            }
        }   
    }
}
