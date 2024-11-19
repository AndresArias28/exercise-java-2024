package clase4;

import java.util.Scanner;


public class Ejercicicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la base: ");
        int base = scanner.nextInt();
        System.out.println("ingresa el exponente");
        int exp = scanner.nextInt();

        calculatePow(base, exp);
    }
    private static void calculatePow(int base, int exp) {
        int result = 1;
        if (exp == 0) {
            System.out.println("el resultado de la potencia es: " + result);
            return;
        }
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        System.out.println("El resultado de la potencia es: " + result);
    }
}
