import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número que queria saber o fatorial: ");
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {

            fatorial *=i; // Aqui multiplica o fatorial pelo valor de i

        }

        System.out.println(String.format("O fatorial de %d é: %d", numero, fatorial));

        leitura.close();

    }
}
