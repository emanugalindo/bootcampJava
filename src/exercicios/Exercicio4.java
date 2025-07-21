package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa:");
        var name1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa:");
        var age1 = scanner.nextInt();
        System.out.println("Digite o nome da segunda pessoa:");
        var name2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa:");
        var age2 = scanner.nextInt();
        var difference = age1 > age2 ? age1 - age2 : age2 - age1;
        System.out.printf("A diferença de idade entre %s e %s é de %s ano(s)", name1, name2, difference);
    }
}
