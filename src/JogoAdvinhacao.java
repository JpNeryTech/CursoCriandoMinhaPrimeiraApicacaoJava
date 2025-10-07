import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {

        Random sorteador = new Random(); // Criar o sorteador dos numeros

        int numeroSecreto = sorteador.nextInt(101); // sortear numero inteiro de 0 a 100

        Scanner leitura = new Scanner(System.in); //Usado para receber entradas do usuario

        int tentativas = 0;
        int numeroEscolhido = 0;

        while (tentativas < 5) {

            System.out.println("Digite um número entre 0 a 100!");
            numeroEscolhido = leitura.nextInt();
            tentativas++;

            if (numeroEscolhido == numeroSecreto) {
                System.out.println("Parabéns você acertou o número secreto em: " + tentativas + " tentativas!");
                break;
            } else if (numeroEscolhido < numeroSecreto) {
                System.out.println("O número secreto é maior que o número secreto!");
            } else {
                System.out.println("O número secreto é menor que o número secreto!");
            }

            if (tentativas < 5) {
                System.out.println("Você ainda tem "+ (5 - tentativas) + " tentativas");
            }
        }
        leitura.close();
    }
}