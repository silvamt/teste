import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("digite a: ");
        a = scan.nextInt();
        System.out.println("digite b: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        System.out.println("soma:" + soma);
        int subtracao = subtracao(a, b);
        System.out.println("subtração:" + subtracao);
        int multiplicacao = multiplicacao(a, b);
        System.out.println("multiplicação:" + multiplicacao);
        float divisao = divisao(a, b);
        System.out.println("divisão:" + divisao);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static float divisao(int a, int b) {
        return a / b;
    }
}
