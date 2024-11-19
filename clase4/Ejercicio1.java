package clase4;

import java.util.Scanner;

/*Necesitamos convertir temperaturas de Celsius a Fahrenheit y viceversa.  
Operaciones para las conversiones:
- **Celsius a Fahrenheit**: La fórmula es `F = (C * (9 / 5)) + 32`.
- **Fahrenheit a Celsius**: La fórmula es `C = (F - 32) / (9 / 5)`. */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el tipo de conversion:   ");
        System.out.println("1. Celsius a Fahrenheit - 2. Fahrenheit a Celsius");
        int tipoCon = scanner.nextInt();
        double temperatura;

        switch (tipoCon) {
            case 1:
                System.out.println("iongrese la temperatura en Celsius: ");
                temperatura = scanner.nextDouble();
                conversionAFahr(temperatura);
                break;

            case 2:
                System.out.println("iongrese la temperatura en Fahrenheit: ");
                temperatura = scanner.nextDouble();
                conversionACel(temperatura);
                break;

            default:
                System.out.println("eleccion no válida");
                break;
        }
    }

    private static void conversionAFahr(double temperatura) {
        double fahrenheit = (temperatura * (9.0 / 5)) + 32;
        System.out.println("la temperatura en Celsius es: " + temperatura);
        System.out.println("la temperatura en Fahrenheit es: " + fahrenheit);
    }

    private static void conversionACel(double temperatura) {
        double celsius = (temperatura - 32) / (9.0 / 5);
        System.out.println("la temperatura en Fahrenheit es: " + temperatura);
        System.out.println("la temperatura en Celsius es: " + celsius);
    }

}
