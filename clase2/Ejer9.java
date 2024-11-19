package clase2;

import java.util.Scanner;

/*
 Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. 
 Usa las siguientes fórmulas:
 Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15
 */
public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados Celsius: ");
        double temp = sc.nextDouble();
        double fahrenheit = temp * 9/5 + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " +fahrenheit );
        sc.close();

    }
    
}
