package clase2;
/*-## Ejercicio 3: ¿Cuántos peces hay en el acuario?
El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri, Tennesse, Arkansas, Misssissipi 
y Louisiana desemboca en el Océano Atlántico produciendo un fenómeno llamado zona muerta. 
Debido a los altos niveles de nitrógeno y fósforo que traen estas aguas los peces mueren en grandes cantidades.
 Para evitar que mueran cientos y cientos de peces, la ONG Salvemos los peces de colores ha decidido poner en cuarentena a 284 
peces rojos y 163 peces azules en un gigantesco acuario, para devolverlos al mar cuando estén curados. 
¿Cuántos peces hay en total dentro del acuario?
 */
public class Ejer3 {
    public static void main(String[] args) {
        int pecesAzules = 284;
        int pecesRojos = 163;

        var totalPeces = pecesAzules + pecesRojos;
        System.out.println("El total de peces es: " + totalPeces);
    } 
    
}
