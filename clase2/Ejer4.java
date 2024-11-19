package clase2;
/*
 Para aprovechar el día del espectador, Carmen decide ir al cine con sus amigos y sale de su casa con 23€. 
 Al regresar se da cuenta que le quedan 12.75€ ¿Sabrías programar cuánto se ha gastado?
 */
public class Ejer4 {
    public static void main(String[] args) {
        int dineroCarmen = 23;
        double dineroRegreso = 12.75;

        double dineroTotal = dineroCarmen - dineroRegreso;
        System.out.println("El total de dinero restante es: " + dineroTotal);
    }
    

}
