package exercicios.exercicio11;

import java.util.Scanner;

public class Petshop {

    private final static Scanner scanner = new Scanner(System.in);
    private final static  MaquinaBanho maquinaBanho = new MaquinaBanho();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var opcao = 1;

        while (opcao != 0){
            System.out.println("=======================================");
            System.out.println("Pet shop Pereira");
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastacer a máquina com água");
            System.out.println("3 - Abastacer a máquina com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção escolhida:");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1 -> maquinaBanho.darBanho();
                case 2 -> colocarAgua();
                case 3 -> colocarShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> verificarSeTemPetNaMaquina();
                case 7 -> colocarPetNaMaquina();
                case 8 -> maquinaBanho.retirarPet();
                case 9 -> maquinaBanho.limparMaquina();
                case 0 -> System.out.println("Saindo........");
                default -> System.out.println("Opção inválida");
            }
        }
        System.out.println("=======================================");
    }

    private static void colocarAgua(){
        System.out.println("Tentando colocar água");
        maquinaBanho.abastecerAgua();
    }

    private static void colocarShampoo(){
        System.out.println("Tentando colocar shampoo");
        maquinaBanho.abastecerShampoo();
    }

    private static void verificarShampoo() {
        var shampoo = maquinaBanho.getNivelShampoo();
        System.out.println("O nível de Shampoo é de: " + shampoo + "l");
    }

    private static void verificarAgua() {
        var agua = maquinaBanho.getNivelAgua();
        System.out.println("O nível da Água é de: " + agua + "l");
    }

    private static void verificarSeTemPetNaMaquina() {
        var temPet = maquinaBanho.verificarPetBanho();
        System.out.println(temPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void colocarPetNaMaquina(){
        var nome=  "";
        while (nome == null || nome.isEmpty()){
            System.out.println("Informe o nome do pet:");
            nome = scanner.next();
        }
        var pet = new Pet(nome);
        maquinaBanho.colocarPet(pet);
    }
    
}
