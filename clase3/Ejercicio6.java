package clase3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0 && numero % 7 == 0)  {
            System.out.println("El número es divisible por dos y siete");
        } else if(numero % 7 == 0) {
            System.out.println("El número es divisible por siete");
        }else  if((numero % 2 == 0)){
            System.out.println("El número es divisible por dos ");
        }else{
            System.out.println("El número no es divisible por dos ni por siete");
        }
        sc.close();
    }
    
}
