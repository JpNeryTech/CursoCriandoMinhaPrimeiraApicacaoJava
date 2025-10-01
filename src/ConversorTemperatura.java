public class ConversorTemperatura {

    public static void main(String[] args) {
    double celsius = 30.5;
    double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(String.format("A temperatura de %f°C, em Fahrenheit é: %f°F" , celsius, fahrenheit));

        int temperaturaFahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é de:" + fahrenheit);
    }
}
