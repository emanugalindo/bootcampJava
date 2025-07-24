package exercicios.exercicio10;

import java.util.Scanner;

public class Dirigir {
    public static void main(String[] args) {
        var carro = new Carro();
        var scannner = new Scanner(System.in);
        var opcao = 1;
        while (opcao != 0) {
            System.out.println("===================================");
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar o carro");
            System.out.println("4 - Diminuir velocidade do carro");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade do carro");
            System.out.println("7 - Trocar a marcha do carro");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção escolhida:");
            opcao = scannner.nextInt();
            switch (opcao) {
                case 1 -> carro.ligarCarro();
                case 2 -> carro.desligarCarro();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> {
                    System.out.println("Para onde você quer virar? [esquerda|direita]");
                    var direcao = scannner.next();
                    carro.virar(direcao);
                }
                case 6 -> carro.verificarVelocidade();
                case 7 -> {
                    System.out.println("Você quer a aumentar ou diminuir a marcha?");
                    var marcha = scannner.next();
                    if (marcha.equalsIgnoreCase("aumentar")) carro.aumentarMarcha();
                    else if (marcha.equalsIgnoreCase("diminuir")) carro.diminuirMarcha();
                    else System.out.println("Opção inválida");
                }
                case 0 -> {
                }
                default -> System.out.println("Opção inválida");
            }
        }
        System.out.println("===================================");
    }
}
