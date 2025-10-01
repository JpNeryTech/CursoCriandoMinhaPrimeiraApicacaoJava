public class DesafioDois {

    // Media de 2 notas

    public static void main(String[] args) {
        double nota1 = 7.8;
        double nota2 = 10;

        double media = (nota1 + nota2) /2;

        System.out.println(String.format("A média das notas %.1f e %.1f é: %.1f" , nota1, nota2, media));

    // Cast Double para Int

        double precoFeijao = 15.50;
        int numeroDeCarros = 3;

        int precoFeijaoInteiro = (int) precoFeijao;

        System.out.println(String.format("O preço do feijão inteiro é: %dR$" ,precoFeijaoInteiro));

    //  Concatenando Char e String

        char letra = 'J';

        String nomeCompleto = "João Pedro Pereira Nery";

        System.out.println("Olá meu nome é " + nomeCompleto +" e a primeira letra do meu nome é " + letra);

    // Calculando preço produto vezes a  quantidade

        double precoProcessador =  1784.89;
        int quantidade = 3;

        double valorPagar = precoProcessador * quantidade;

        System.out.println(String.format("O processador custa %.2f e você está levando %d então irá pagar: %.2fR$ !",precoProcessador, quantidade, valorPagar));

    // Convertendo Dolar

        double quantidaDeDolares = 1250.56;

        double converterRealParaDolar = quantidaDeDolares * 5.50;

        System.out.println(String.format("Para comprar %.2f você irá pagar %.2fR$" ,quantidaDeDolares, converterRealParaDolar));

    // Aplicando desconto em produto

        double precoOriginal = 1250.99;
        int percentualDesconto = 10;

        double desconto = (precoOriginal * percentualDesconto) /100;

        double total = precoOriginal - desconto;

        System.out.println(String.format("O produto custa R$ %.2f, com o desconto de 10%% ele passa a custar %.2f" ,precoOriginal, total));














    }
}
