package clase3;

import java.util.Scanner;

/*
 Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        char letraIngresada = scanner.next().charAt(0);

        if (Character.isUpperCase(letraIngresada)) {
            System.out.println("La letra  es mayúscula.");
        } else if (Character.isLowerCase(letraIngresada)) {
            System.out.println("La letra es minúscula.");
        } else {
            System.out.println("El caracter ingresado no es una letra.");
        }

    }
    
}
