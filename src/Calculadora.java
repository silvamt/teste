import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = somar(a, b);
        System.out.println("Soma:" + soma);
        int subtracao = subtrair(a, b);
        System.out.println("Subtração:" + subtracao);
        int multiplicacao = multiplicar(a, b);
        System.out.println("Multiplicação:" + multiplicacao);
        float divisao = dividir(a, b);
        System.out.println("Divisão:" + divisao);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(int a, int b) {
        return a / b;
    }
}
