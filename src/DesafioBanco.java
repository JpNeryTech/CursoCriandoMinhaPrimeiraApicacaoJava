import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        System.out.println("Seja Bem Vindo ao JOTABANK!");
        System.out.println("---------------------------");

        Scanner leitura = new Scanner(System.in);

        // DADOS DO CLIENTE

        System.out.println("Digite o seu nome completo:");
        String cliente = leitura.nextLine();

        System.out.println("Digite o seu saldo:");
        double saldo = leitura.nextDouble();

        // MENU DE OPÇÕES

        System.out.println(
                " " +
                "1 = Consultar Saldo \n " +
                "2 = Sacar \n " +
                "3 = Depositar \n " +
                "4 = Sair");
        int escolha = leitura.nextInt();

        switch (escolha) {
            case 1:
            System.out.println("O seu saldo é: " +saldo);
            break;
            case 2:
                System.out.println("Insira o valor que deseja SACAR:");
                double valorSaque = leitura.nextDouble();
                double saque = saldo - valorSaque;
                if (valorSaque > saldo) {
                    System.out.println("Você não tem o saldo suficiente!");
                } else {
                    System.out.println(String.format(
                            " " +
                            "Você efetuou o saque de: %.2f R$\n " +
                            "Seu saldo ficou igual a: %.2f R$" ,valorSaque, saque));
                }
                break;
            case 3:
                System.out.println("Insira o valor que deseja DEPOSITAR:");
                double valorDeposito = leitura.nextDouble();
                double deposito = saldo + valorDeposito;
                if (valorDeposito > 0) {
                    System.out.println(String.format(
                            " " +
                            "Você depositou %.2f R$ \n " +
                            "Seu saldo ficou igual a %.2f R$" ,valorDeposito, deposito));
                } else {
                    System.out.println("Você não pode depositar um valor negativo!");
                }
                break;
            case 4:
                System.out.println("Saindo do JOTABANK!...");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
            leitura.close();
    }
}
