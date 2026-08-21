import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        
        Scanner sc = new Scanner(System.in);
        String numeroTeste;
        int n;

        int[] leds = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int total = 0;

            numeroTeste = sc.next();

            for (int j = 0; j < numeroTeste.length(); j++) {

                char digito = numeroTeste.charAt(j);

                int valor = digito - '0';
                total += leds[valor];

         
            }

                 System.out.println(total + " leds");

        }
        sc.close();

    }
}
