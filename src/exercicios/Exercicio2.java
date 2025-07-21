package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        var side = scanner.nextInt();
        var area = side * side;
        System.out.printf("A área do quadrado é %s\n", area);
    }
}
