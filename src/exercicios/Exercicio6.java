package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Cálculo de IMC");
        System.out.println("Digite a altura:");
        var height = scanner.nextDouble();
        System.out.println("Digite peso:");
        var weight = scanner.nextDouble();
        var imc = weight / (height * height);
        var message = "";
        if (imc <= 18.5){
            message = "Abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            message = "Peso ideal";
        } else if (imc >= 25 && imc <= 29.9) {
            message = "Levemente acima do peso";
        } else if (imc >= 30 && imc <= 34.9) {
            message = "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            message = "Obesidade Grau II (Severa)";
        }else {
            message = "Obesidade Grau III (Mórbida)";
        }
        System.out.printf("IMC: %.1f\n", imc);
        System.out.println(message);
    }
}
