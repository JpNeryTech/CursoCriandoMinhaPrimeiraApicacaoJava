import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            System.out.println(numero + "x" + i + "=" + resultado);

        }
        leitura.close();
    }
}
