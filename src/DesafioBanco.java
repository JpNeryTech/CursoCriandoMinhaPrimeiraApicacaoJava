import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        System.out.println("Seja Bem Vindo ao JOTABANK!");
        System.out.println("--------------------------- \n");

        Scanner leitura = new Scanner(System.in);

        // DADOS DO CLIENTE

        String nomeCliente = "Flaco Lopes";
        String tipoConta = "Corrente";
        double saldo = 1500000;

        System.out.println("Nome do Cliente: " +nomeCliente);
        System.out.println("Tipo da Conta:  " +tipoConta);
        System.out.println("Saldo Atual:  " +saldo);
        System.out.println("\n*************************");

        int escolha = 0;

        // MENU DE OPÇÕES

        String menu = """
                    
                    Insira sua Opção!
                    1 = Consultar Saldo  
                    2 = Sacar   
                    3 = Depositar   
                    4 = Sair
                    
                    """;

        while (escolha != 4) {

            System.out.println(menu);

            escolha = leitura.nextInt();

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
                        saldo -= valorSaque;
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
                        saldo += valorDeposito;
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
        }
        leitura.close();
    }

}

