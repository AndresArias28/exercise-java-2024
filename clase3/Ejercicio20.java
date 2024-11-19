package clase3;

public class Ejercicio20 {
    public static void main(String[] args) {

        String vec1[] ={"| B |", "| N |"};
        String vec2[] ={"| N |", "| B |"};

        int n = 0;
        while (n<4) {
            for (int i = 0; i < 2; i++) {
                System.out.print(vec1[i]);
                System.out.print(vec2[i]);
                System.out.print(vec1[i]);
                System.out.print(vec2[i]);
                System.out.print(vec1[i]);
                System.out.print(vec2[i]);
                System.out.print(vec1[i]);
                System.out.println(vec2[i]);
            }
            n+=1;
        }

    }
}
