package clase4;

import java.util.Scanner;

/*El factorial de un número entero positivo `n` (denotado como `n!`) es el producto de todos los enteros positivos desde 1 hasta `n`.  
Por ejemplo:  
```
3! = 3 * 2 * 1 = 6
5! = 5 * 4 * 3 * 2 * 1 = 120 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un número entero positivo: ");
        int num = scanner.nextInt();
        calculaFactorial(num);

        scanner.close();
    }

    private static void calculaFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
