import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número n para gerar a série de Fibonacci até o n-ésimo termo
        System.out.println("Digite o valor de n para gerar a série de Fibonacci até o n-ésimo termo:");
        int n = scanner.nextInt();

        // Verifica se o valor de n é válido (maior que 0)
        if (n <= 0) {
            System.out.println("Valor inválido. Digite um número maior que zero.");
        } else {
            // Gera a série de Fibonacci até o n-ésimo termo
            System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
            for (int i = 1; i <= n; i++) {
                System.out.print(calcularFibonacci(i) + " ");
            }
        }

        scanner.close();
    }

    // Função para calcular o n-ésimo termo da série de Fibonacci de forma recursiva
    public static int calcularFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
