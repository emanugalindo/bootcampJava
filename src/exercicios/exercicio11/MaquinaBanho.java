package exercicios.exercicio11;

public class MaquinaBanho {
    private int nivelAgua = 30;
    private int nivelShampoo = 10;
    private boolean maquinaLimpa = true;
    private Pet pet;

    public void darBanho() {
        if (this.pet == null && maquinaLimpa) {
            System.out.println("Coloque o pet");
            return;
        }
        this.nivelAgua -= 10;
        this.nivelShampoo -= 2;
        pet.setLimpo(true);
        System.out.println("O pet " + pet.getNome() + " está limpo");
    }

    public void abastecerAgua() {
        if (nivelAgua < 29) {
            System.out.println("Abastecendo a água......");
            nivelAgua += 2;
            return;
        }
        System.out.println("A capacidade de água da máquina está no máximo");
    }

    public void abastecerShampoo() {
        if (nivelShampoo < 9) {
            System.out.println("Abastecendo o shampoo.....");
            nivelShampoo += 2;
            return;
        }
        System.out.println("A capacidade de shampoo da máquina está no máximo");
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public int getNivelShampoo() {
        return nivelShampoo;
    }

    public boolean verificarPetBanho() {
        return pet != null;
    }

    public void colocarPet(Pet pet) {
        if (!this.maquinaLimpa){
            System.out.println("A máquina está suja, limpe ela antes de colocar o pet");
            return;
        }
        if (verificarPetBanho()){
            System.out.println("O pet " + this.pet.getNome() + " está ná máquina");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado ná maquina");
    }

    public void retirarPet() {
        this.maquinaLimpa = this.pet.isLimpo();

        System.out.println("Retirando pet.....");
        this.pet = null;
    }

    public void limparMaquina() {
        if (nivelAgua >= 3 && nivelShampoo >= 1 && !maquinaLimpa) {
            System.out.println("Limpando a máquina.....");
            nivelAgua -= 3;
            nivelShampoo -= 1;
            maquinaLimpa = true;
            System.out.println("Máquina limpa");
        }
    }
}
