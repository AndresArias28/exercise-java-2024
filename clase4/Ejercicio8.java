package clase4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        resolverAreas(scanner);
    }

    private static void resolverAreas(Scanner sc) {
        System.out.println("ingrese el tipo de figura a calcular el area: ");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        int figura = sc.nextInt();

        switch (figura) {
            case 1:
                calculaAreaCirculo(sc); // Llamada a la nueva función scanner
                break;
            case 2:
                calculaAreaCuadrado(sc);
                break;
            case 3:
                calculaAreaTriangulo(sc);

                break;
            default:
                System.out.println("opción no válida");
                break;
        }
    }

    private static void calculaAreaCuadrado(Scanner sc) {
        System.out.println("ingrese la longitud del lado del cuadrado: ");
        double lado = sc.nextDouble();
        int result = 1;

        for (int i = 0; i < 2; i++) {
            result *= lado;
        }
        System.out.println("el resultado de la potencia es: " + result);
    }

    private static void calculaAreaCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("el area del circulo es: " + areaCirculo);
    }

    private static void calculaAreaTriangulo(Scanner scanner) {
        System.out.println("ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.println("ingrese la altura del triangulo: ");
        double altura = scanner.nextDouble();
        double areaTriangulo = (base * altura) / 2;
        System.out.println("area del triángulo es: " + areaTriangulo);
    }
}
