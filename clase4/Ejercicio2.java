package clase4;

import java.util.Scanner;

/*Un palíndromo es una palabra, frase o secuencia de caracteres que se lee igual de izquierda a derecha que de derecha a izquierda, ignorando espacios, puntuación y mayúsculas.  
Ejemplos:  A man, a plan, a canal, Panama --> es palindrome */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        resolverPalindromo(scanner);
        scanner.close();
        
    }
    
    private static boolean calcularPalindromo(String palabra) {
        String palabraL =  palabra.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
        String palabraInvertida = new StringBuilder(palabraL).reverse().toString();
        return palabra.equalsIgnoreCase(palabraInvertida);
        // otra forma de hacerlo
        // return palabra.replaceAll("[^a-zA-Z]",
        // "").equalsIgnoreCase(palabraInvertida.replaceAll("[^a-zA-Z]", ""));
    }
    private static void resolverPalindromo(Scanner sc){
        System.out.println("ingresa una palabra o frasse: ");
        String palabra = sc.nextLine();
        if (calcularPalindromo(palabra)) {
            System.out.println("La palabra o frase es un palíndromo");
        } else {
            System.out.println("La palabra o frase no es un palíndromo");
            
        }
    }
}