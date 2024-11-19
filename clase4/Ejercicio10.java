package clase4;

/*Necesitamos generar la tabla de multiplicar de un número dado por el usuario, mostrando los resultados desde 1 hasta 10. */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calcularMultiplicacion(scanner);

    }

    private static void calcularMultiplicacion(Scanner scanner) {
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            // System.out.println(numero + " x " + i + " = " + (numero * i));
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i));
        }
    }
}