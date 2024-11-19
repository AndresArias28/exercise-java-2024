package clase4;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculaIntereses(scanner);
    }

    private static void calculaIntereses(Scanner scanner) {
        System.out.println("ingres que tipo de interes desea calcular: ");
        System.out.println("1. Interes Simple");
        System.out.println("2. Interes Compuesto");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                calculaInteresSimple(scanner);
                break;
            case 2:
                calculaInteresCompuesto(scanner);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void calculaInteresSimple(Scanner scanner) {
        System.out.println("ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();
        System.out.println("ingrese la tasa de interés anual: ");
        double tasaInteresAnual = scanner.nextDouble();
        System.out.println("ingrese el tiempo en años: ");
        int tiempo = scanner.nextInt();
        double interesSimple = capitalInicial * tasaInteresAnual * tiempo;
        System.out.println("el interés simple es: " + interesSimple);
    }

    private static void calculaInteresCompuesto(Scanner scanner) {
        System.out.println("ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();
        System.out.println("ingrese la tasa de interés anual: ");
        double tasaInteresAnual = scanner.nextDouble();
        System.out.println("ingrese el tiempo en años: ");
        int tiempo = scanner.nextInt();
        System.out.println("ingrese el número de veces que se aplica el interés compuesto por año: ");
        int veces = scanner.nextInt();
        double interesCompuesto = capitalInicial * Math.pow(1 + (tasaInteresAnual / veces), veces * tiempo);
        System.out.println("el interés compuesto es: " + interesCompuesto);
    }
}