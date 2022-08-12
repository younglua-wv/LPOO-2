import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        int Num1 = 0;
        int Num2 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        Num1 = teclado.nextInt();
        System.out.println("Digite mais um número inteiro: ");
        Num2 = teclado.nextInt();
        System.out.println("O resultado da soma entre " + Num1 + " e " + Num2 + " é " + (Num1 + Num2));
        System.out.println("O resultado da subtração entre " + Num1 + " e " + Num2 + " é " + (Num1 - Num2));
        System.out.println("O resultado da multiplicação entre " + Num1 + " e " + Num2 + " é " + (Num1 * Num2));
        System.out.println("O resultado da divisão entre " + Num1 + " e " + Num2 + " é " + (Num1 / Num2));

    }
}
