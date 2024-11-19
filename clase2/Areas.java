package clase2;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la longitud: ");
        var longitud = entrada.nextDouble();
        System.out.println("ingrese el ancho: ");
        var ancho = entrada.nextDouble();
        var area = longitud * ancho;
        var perimetro = 2*longitud + 2*ancho;
        
        System.out.printf("El area del recatangulo es %.2f",area);
        System.out.printf("/n El perimetro del recatangulo es "+perimetro);
        entrada.close();
    }
    
}
