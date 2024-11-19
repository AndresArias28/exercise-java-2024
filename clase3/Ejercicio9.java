package clase3;

import java.util.Scanner;

/*Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de unidades que le compren. La siguiente tabla muestra la información: 
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de camisas: ");
        int cantidadCamisas = scanner.nextInt();

        if (cantidadCamisas <= 50 && cantidadCamisas > 0) {
            System.out.println("el precio por unidad es: $50.000");
        } else if (cantidadCamisas <= 100 && cantidadCamisas > 50) {
            System.out.println("el precio por unidad es: $45.000");
        } else if (cantidadCamisas > 100 && cantidadCamisas <= 150) {
            System.out.println("el precio por unidad es: $40.000");
        } else if (cantidadCamisas > 150) {
            System.out.println("el precio por unidad es: $35.000");
        } else if (cantidadCamisas > 200) {
            System.out.println("el precio por unidad es: $25.000");

        } else {
            System.out.println("Cantidad no válida");
        }
    }
}