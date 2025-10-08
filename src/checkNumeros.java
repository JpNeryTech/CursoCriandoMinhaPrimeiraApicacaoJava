import java.util.Scanner;

public class checkNumeros {

    public static void main(String[] args) {

        int numInteiro = 0;
        int segundoNumeroInteiro = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro!");
        numInteiro = leitura.nextInt();
        System.out.println("Digite um número inteiro!");
        segundoNumeroInteiro = leitura.nextInt();

        if (numInteiro == segundoNumeroInteiro) {

            System.out.printf("Os números %d e %d são iguais!%n", numInteiro, segundoNumeroInteiro); // Substitui o String Format por "printf" que é a mesma coisa mais resumida e no final adicionei um %n para ter uma quebra de linha
            return;
        } else {

            System.out.printf("Os números %d e %d são diferentes %n", numInteiro, segundoNumeroInteiro);

        }
        if (numInteiro > segundoNumeroInteiro) {
            System.out.printf("O número %d é maior que o número %d ", numInteiro, segundoNumeroInteiro);
        } else {
            System.out.printf("O número %d é menor que o número %d %n", numInteiro, segundoNumeroInteiro);
        }
    }
}