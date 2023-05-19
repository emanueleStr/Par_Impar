import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra se o numero é par ou impar");
        System.out.println("Digite um numero");

        int numero = sc.nextInt();


        if (numero % 2 == 0) {
            System.out.println("Par");

        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}