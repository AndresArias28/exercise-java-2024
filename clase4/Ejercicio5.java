package clase4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres numero: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        calcularPromedio(numero1, numero2, numero3);
    }

    private static void calcularPromedio(int numero1, int numero2, int numero3) {
        
        double promedio = (numero1 + numero2 + numero3) / 3.0;
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}