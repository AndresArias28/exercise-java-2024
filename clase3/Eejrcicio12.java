package clase3;

import java.util.Scanner;

public class Eejrcicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso;

        System.out.println("ingresa el peso de la sandida: ");
        peso = sc.nextInt();

        if (peso % 2 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
    
}
  