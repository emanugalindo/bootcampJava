package exercicios;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo:");
        var base = scanner.nextInt();
        System.out.println("Digite a altura do retângulo:");
        var height = scanner.nextInt();
        var area = base * height;
        System.out.printf("A área do retângulo é %s", area);
    }
}
