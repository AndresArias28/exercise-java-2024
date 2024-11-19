package clase3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una un numero correspondiente a un mes (0-12): ");
        int mes = scanner.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                || mes == 10 || mes == 12) {
            System.out.print("el mes tiene 31 dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.print("el mes tiene 30 dias");
        } else if (mes == 2) {
            System.out.print("el mes tiene 28 dias");
        } else {
            System.out.println("el numero ingresado supera los 12");
        } 
    }
    
}
