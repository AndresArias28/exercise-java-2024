package clase2;

import java.util.Scanner;

/*-## Ejercicio 7: Calculadora Básica
 *Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta,
   multiplicación y división con esos números. Muestra los resultados en la consola.
 */
public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
        sc.close();
    }
    
}
