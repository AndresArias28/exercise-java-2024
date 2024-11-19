package clase2;

import java.util.Scanner;

public class Ejer2 {
  
    public static void main(String[] args) {
          //En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa los kilos del producto: ");
        var kilos = scanner.nextDouble();
        var precioXgramo = 0.0595;
        var precioXkilo = precioXgramo *1000*kilos;
        System.out.println("el precio por kilo es: " +precioXkilo);
        scanner.close();

        /*
         En el mercado, podemos encontrar que el precio del producto **Pernil Iberic D'Engreix Llen. 
         Azuaga** en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo 
         cuesta 29,75€. ¿Crees que es correcto el precio?
         Respuesta: considero que no es correcto
         */
    }
}
