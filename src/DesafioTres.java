import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numeroEscolhido = 0;

        System.out.println("Digite um número inteiro!");
        numeroEscolhido = leitura.nextInt();
        if (numeroEscolhido >= 0) {

            System.out.println("O número escolhido: " +numeroEscolhido+ " é positivo");

        } else {
            System.out.println(String.format("O número escolhido: %d é negativo ", numeroEscolhido));
        }
    }
}

