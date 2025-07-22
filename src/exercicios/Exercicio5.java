package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Programa que gera a tabuada de um determinado número");
        System.out.println("Informe o número da tabuada a ser calculada:");
        var table = scanner.nextInt();
        System.out.printf("Tabuada do %s\n", table);
        System.out.println("=========================");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s\n", table, i, table * i);
        }
        System.out.println("=========================");
    }
}
