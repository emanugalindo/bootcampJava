package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        var number1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        var number2 = scanner.nextInt();
        while (number2 <= number1){
            System.out.println("Digite o segundo número novamente:");
            number2 = scanner.nextInt();
        }
        System.out.println("Escolha entre par ou impar:");
        var option = scanner.next();
        while (!option.equalsIgnoreCase("par") && !option.equalsIgnoreCase("impar")){
            System.out.println("Digite par ou impar:");
            option = scanner.next();
        }
        for (int i = number2; i >= number1; i--) {
            if (option.equalsIgnoreCase("par") && i % 2 == 0){
                System.out.println(i);
            } else if (option.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
