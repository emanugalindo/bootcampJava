package exercicios.exercicio9;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o valor do saldo da conta:");
        var saldo = scanner.nextDouble();
        var conta = new Conta(saldo);
        var opcao = 1;
        var valor = 0.0;
        while (opcao != 0){
            System.out.println("=============================================================");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção escolhida:");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 ->{
                    System.out.println("Digite o valor que você deseja depositar:");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                }
                case 4 -> {
                    System.out.println("Digite o valor que você deseja sacar:");
                    valor = scanner.nextDouble();
                    conta.sacar(valor);
                }
                case 5 ->{
                    System.out.println("Digite o valor do boleto:");
                    valor = scanner.nextDouble();
                    conta.pagarBoleto(valor);
                }
                case 6 -> conta.estaUsandoChequeEspecial();
                case 0 -> {}
                default -> System.out.println("Opção inválida");
            }
        }
        System.out.println("=============================================================");
    }
}
