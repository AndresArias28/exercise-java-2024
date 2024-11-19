package clase3;

import java.util.Scanner;

/**Realice un programa en el que ingrese un número y muestre el cubo. Repita el proceso hasta que se introduzca un valor negativo. */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int numero;
       
            System.out.println("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                System.out.println("el numero al cubo de  es: " + Math.pow(numero, 3));
            }
      
    }
}
