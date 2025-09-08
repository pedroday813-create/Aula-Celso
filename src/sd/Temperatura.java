package sd;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 2. Solicitar a Temperatura
        System.out.print("Digite a temperatura em Celsius: ");
        double Celsius = scanner.nextDouble();
        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = scanner.nextDouble();

        // 4. Calcular a Temperatura

        double Fahrenheit = (Celsius * 9/5) + 32;
        double Kelvin = Celsius + 273.15;

        // 5. Exibir o resultado
        System.out.println(Celsius + " Celsius " + "Equivale a F°" + Fahrenheit);
        System.out.println(Celsius + " Celsius " + "Equivale a K°" + Kelvin);

        scanner.close();
    }
}