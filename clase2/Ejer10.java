package clase2;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("ingresa el tercer numero: ");
        int num3 = scanner.nextInt();

        //calcula la media
        double media = (num1 + num2 + num3) / 3;
        System.out.println("La media de los numeros es: " + media);
        scanner.close();
    }
    
}
