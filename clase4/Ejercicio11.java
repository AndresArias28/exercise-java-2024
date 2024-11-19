package clase4;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = calculaIMC(peso, altura);
        determinarCat(imc);

    }

    private static void determinarCat(double imc) {
        if (imc < 18.5) {
            System.out.println("Categoría:Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Categoría:Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Categoría:Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Categoría:Obesidad grado I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Categoría:Obesidad grado II");
        } else {
            System.out.println("Categoría:Obesidad grado III");
        }
    }

    private static double calculaIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);
        return imc;
    }
}
