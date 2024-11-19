package clase3;
/*Escriba un programa que genere 120 números aleatorios entre -100 y 100. Imprime los
siguientes cálculos:
- Sumar los valores positivos. */
public class Ejercicio18 {
    public static void main(String[] args) {
        int sum = 0;
        int sumNegativos = 0;
        

        for (int i = 0; i < 120; i++) {
            int num = (int) (Math.random() * 200 - 100);
            if (num > 0) {
                sum += num;
            }else{
                sumNegativos += num;
            }
        }
        System.out.println("suma de los valores positivos es: " + sum);
        System.out.println("suma numeros negativos: " + sumNegativos);
     }
}
