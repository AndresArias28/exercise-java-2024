package clase4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de conversion: ");
        System.out.println("1. de gramos a kilogramos");
        System.out.println("2. de kilogramos a gramos");
        System.out.println("3. de metros a kilometros");
        System.out.println("4. de kilometros a metros");
        int opc = scanner.nextInt();
        System.out.println("Ingrese la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();

        switch (opc) {
            case 1:
                calcularGramoaK(cantidad);
            break;
            case 2:
                calcularKilogramoaG(cantidad);
            break;
            case 3:
                calcularAKilometro(cantidad);
            break;
            case 4:
                calcularAMetro(cantidad);
            break;
            default:
                System.out.println("eleccion no válida");
            break;
        }
    }
    private static void calcularGramoaK(double cantidad) {
        double kilos = cantidad / 1000;
        System.out.println("La cantidad en kilogramos es: " + kilos);
    }

    private static void calcularKilogramoaG(double cantidad) {
        double gramos = cantidad * 1000;
        System.out.println("La cantidad en gramos es: " + gramos);
    }
    private static void calcularAKilometro(double cantidad) {
        double kilometros = cantidad / 1000;
        System.out.println("La cantidad en kilometros es: " + kilometros);
    }
    private static void calcularAMetro(double cantidad) {
        double metros = cantidad * 1000;
        System.out.println("La cantidad en metros es: " + metros);
    }

}