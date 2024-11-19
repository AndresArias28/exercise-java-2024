package clase2;
/*
 Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los accesorios 
 incluidos. Sin embargo, el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total 
 por el ordenador con todos los accesorios?
 */
public class Ejer5 {
    public static void main(String[] args) {

        var costoPC = 660;
        var descuento = 0.1;
        var total = costoPC - (costoPC * descuento);
        System.out.println("El total a pagar es: " + total);
        
    }                                                                                                                                         
    
}
