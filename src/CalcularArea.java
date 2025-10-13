import java.util.Scanner;

public class CalcularArea {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int escolha = 0;

        System.out.println("Para calcular a área do quadrado digite 1. Se quiser calcular a área do Circulo digite 2.");
        escolha = leitura.nextInt();

        if( escolha == 1) {

            double lado1 = 0;
            double lado2 = 0;

            System.out.println("Digite o valor do lado do quadrado:");
            lado1 = leitura.nextDouble();
            System.out.println("Digite o segundo valor do lado do quadrado:");
            lado2 = leitura.nextDouble();

            double areaQuadrado = lado1 * lado2;

            System.out.println(String.format("A área do quadrado é: %.2f" ,areaQuadrado));

        } else if( escolha == 2){

            double raio = 0;

            System.out.println("Digite o número do Raio:");
            raio = leitura.nextDouble();

            double areaCirculo = Math.PI * Math.pow(raio, 2);

            System.out.println(String.format("A área do circulo é: %.2f" ,areaCirculo));

        } else {

            System.out.println("Opção invalida!");

        }
        leitura.close();
    }
}
