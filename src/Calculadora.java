import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        double soma = somar(a, b);
        System.out.println("Soma:" + soma);
        double subtracao = subtrair(a, b);
        System.out.println("Subtração:" + subtracao);
        double multiplicacao = multiplicar(a, b);
        System.out.println("Multiplicação:" + multiplicacao);
        double divisao = dividir(a, b);
        System.out.println("Divisão:" + divisao);
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
