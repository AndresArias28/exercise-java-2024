package clase3;

import java.util.Scanner;

/*Realizar un programa que permita hacer la siguiente conversión:
- Millas a kilómetros. 
- Kilómetros a millas. 

Considera que  
- 1 milla son 1.60934 kilómetros  
- 1 kilómetro es 0.621371 millas */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("distancia en millas:");
        double millas = scanner.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println("La distancia en kilometros es: " + kilometros);
        scanner.close();
        
    }
}
