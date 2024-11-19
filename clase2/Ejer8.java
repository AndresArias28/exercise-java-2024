package clase2;
/*
 Crea un programa que calcule el área y el perímetro de un rectángulo. 
 Solicita al usuario la longitud y el ancho del rectángulo.
 */
public  class Ejer8 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingresa la longitud del rectangulo: ");
        double longitud = sc.nextDouble();
        System.out.println("Ingresa el ancho del rectangulo: ");
        double ancho = sc.nextDouble();
        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        sc.close();
    }
    
}
