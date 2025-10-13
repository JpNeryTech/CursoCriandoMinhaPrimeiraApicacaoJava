import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = leitura.nextInt();

         if (numero %2 == 0) {
             System.out.println(String.format("O número %d é PAR" ,numero));
         } else {
             System.out.println(String.format("O número %d é IMPAR" ,numero));
         }
        leitura.close();
    }

}
