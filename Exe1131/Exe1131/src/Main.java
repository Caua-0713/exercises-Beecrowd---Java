import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int resposta = 1;
        int vGremio = 0,
                vInter = 0,
                empates = 0;
        int cont = 0, aux;

        Scanner sc = new Scanner(System.in);

        do {
            cont++;

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                empates++;
            } else if (a > b) {

                vInter++;
            } else {

                vGremio++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            resposta = sc.nextInt();

        } while (resposta != 2);

        System.out.println(cont + " grenais");
        System.out.println("Inter:" + vInter);
        System.out.println("Gremio:" + vGremio);
        System.out.println("Empates:" + empates);

        if (vInter == vGremio){
        System.out.println("Nao houve vencedor");

        } else if(vInter > vGremio){
            System.out.println("Inter venceu mais");
        } else {

        System.out.println("Gremio venceu mais");
        }

    }
}
