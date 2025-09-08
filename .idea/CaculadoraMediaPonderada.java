import java.util.Scanner;

public class CaculadoraMediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // 2. Solicitar as notas
        System.out.print("Digite a Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a Nota 3: ");
        double nota3 = scanner.nextDouble();

        // 3. Solicitar os pesos
        System.out.print("Digite o Peso 1: ");
        double peso1 = scanner.nextDouble();
        System.out.print("Digite o Peso 2: ");
        double peso2 = scanner.nextDouble();
        System.out.print("Digite o Peso 3: ");
        double peso3 = scanner.nextDouble();

        // 4. Calcular a média ponderada
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;

        // 5. Exibir o resultado
        System.out.printf("A média ponderada do aluno %s é: %.2f\n", nome, mediaPonderada);

        scanner.close();
    }
}