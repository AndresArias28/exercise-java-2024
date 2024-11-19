package clase2;
/*
Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían
 un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento?
 */
public class Ejer6 {
    public static void main(String[] args) {
            
            var precioFinal = 34;
            var descuento = 0.15;
            var precioAntesDescuento = precioFinal / (1-  descuento);
            System.out.println("El precio antes del descuento es: " + precioAntesDescuento);
    }
    
}
