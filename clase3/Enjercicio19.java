package clase3;

import java.util.Scanner;

/*Esta sucesión comienza con los números 0 y 1. El siguiente miembro se calcula como la suma de los dos inmediatamente anteriores.  
Crea un programa reciba un número (N) del usuario y muestre los primeros N números de sucesión.
 */
public class Enjercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = num1 + num2;
            System.out.println(suma);
            num1 = num2;
            num2 = suma;
        }
        
    }
    
}
