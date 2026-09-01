import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       int x;
        Scanner sc = new Scanner(System.in);
        float y, total;

        x = sc.nextInt();
        y = sc.nextFloat();

    System.out.printf("%.3f km/l%n", x / y);
        sc.close();



    }
}
