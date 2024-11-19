package clase3;

import java.util.Scanner;

/* a + b > c, a + c > b, b + c > a
 Escriba un programa que permita ingresar tres números (representan la longitud de una 
 línea) y compruebe si con estos números se puede formar un triángulo.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la primera línea: ");
        int a = sc.nextInt();
        System.out.println("Ingrese la longitud de la segunda línea: ");
        int b = sc.nextInt();
        System.out.println("Ingrese la longitud de la tercera línea: ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Se puede formar un triángulo");
        } else {
            System.out.println("No se puede formar un triángulo");
        }
    }
    
}
