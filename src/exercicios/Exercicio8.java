package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        var number1 = scanner.nextInt();
        while (true) {
            System.out.println("Informe um número para verificação");
            var number2 = scanner.nextInt();
            if (number2 < number1) {
                System.out.printf("Informe um número maior que %s\n", number1);
                continue;
            }
            var result = number2 % number1;
            System.out.printf("%s %% %s = %s\n", number2, number1, result);
            if (result == 0) break;
        }

    }
}
