package exercicios.exercicio10;

public class Carro {
    private boolean estaLigado = false;
    private int velocidade = 0;
    private int marcha = 0;

    public void ligarCarro() {
        if (estaLigado) {
            System.out.println("O carro já está ligado");
            return;
        }
        if (marcha != 0) System.out.println("Coloque no ponto morto");
        System.out.println("Ligando o carro.....");
        System.out.println("Carro ligado");
        estaLigado = true;
    }

    public void desligarCarro() {
        if (!estaLigado) {
            System.out.println("O carro já está desligado");
            return;
        }
        if (marcha != 0 || velocidade != 0) {
            System.out.println("Para desligar, coloque na marcha 0 e pare completamente o carro");
            return;
        }
        System.out.println("Desligando o carro.....");
        estaLigado = false;
        System.out.println("Carro desligado");
    }

    public void acelerar() {
        if (!estaLigado) {
            System.out.println("Ligue o carro primeiro");
            return;
        }
        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto");
            return;
        }
        if ((marcha == 1 && velocidade >= 20) ||
                (marcha == 2 && velocidade >= 40) ||
                (marcha == 3 && velocidade >= 60) ||
                (marcha == 4 && velocidade >= 80) ||
                (marcha == 5 && velocidade >= 100) ||
                (marcha == 6 && velocidade >= 120)) {
            System.out.println("Velocidade máxima para a marcha atual");
            return;
        }
        if ((marcha >= 2 && velocidade < 20) ||
                (marcha >= 3 && velocidade < 40) ||
                (marcha >= 4 && velocidade < 60) ||
                (marcha >= 5 && velocidade < 80) ||
                (marcha == 6 && velocidade < 100)) {
            System.out.println("Velocidade muito baixa para esta marcha");
            return;
        }
        velocidade++;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    public void diminuirVelocidade() {
        if (!estaLigado) {
            System.out.println("Ligue o carro primeiro");
            return;
        }
        if (velocidade <= 0) {
            System.out.println("O carro já está parado");
            return;
        }
        if ((marcha == 1 && velocidade <= 1) ||
                (marcha == 2 && velocidade <= 21) ||
                (marcha == 3 && velocidade <= 41) ||
                (marcha == 4 && velocidade <= 61) ||
                (marcha == 5 && velocidade <= 81) ||
                (marcha == 6 && velocidade <= 101)) {
            System.out.println("Velocidade mínima para esta marcha - reduza a marcha primeiro");
            return;
        }
        velocidade--;
        System.out.println("Diminuindo velocidade... Velocidade atual: " + velocidade + " km/h");
    }

    public void virar(String direcao) {
        if (direcao.equalsIgnoreCase("esquerda") && velocidade >= 1 && velocidade <= 40 && estaLigado) {
            System.out.println("Virando para a esquerda");
        } else if (direcao.equalsIgnoreCase("direita") && velocidade >= 1 && velocidade <= 40 && estaLigado) {
            System.out.println("Virando para a direita");
        } else if (velocidade > 40) System.out.println("Diminua para 40 km/h ou menos");
        else System.out.println("Direção inválida");
    }

    public void verificarVelocidade() {
        if (!estaLigado) return;
        System.out.printf("A velocidade é de %d km/h\n", velocidade);
    }

    public void aumentarMarcha() {
        if (!estaLigado || marcha == 6) return;
        if ((marcha == 0 && velocidade == 0) ||
                (marcha == 1 && velocidade >= 20) ||
                (marcha == 2 && velocidade >= 40) ||
                (marcha == 3 && velocidade >= 60) ||
                (marcha == 4 && velocidade >= 80) ||
                (marcha == 5 && velocidade >= 100)) {
            marcha++;
            System.out.println("Marcha aumentada para: " + marcha);
        } else {
            System.out.println("Não é possível aumentar a marcha na velocidade atual");
        }
    }

    public void diminuirMarcha() {
        if (!estaLigado) {
            System.out.println("Ligue o carro primeiro");
            return;
        }
        if (marcha == 0) {
            System.out.println("Já está no ponto morto");
            return;
        }
        if (marcha == 1 && velocidade == 0) {
            marcha = 0;
            System.out.println("Marcha reduzida para: ponto morto");
            return;
        }
        if ((marcha == 1 && velocidade > 20) ||
                (marcha == 2 && velocidade > 40) ||
                (marcha == 3 && velocidade > 60) ||
                (marcha == 4 && velocidade > 80) ||
                (marcha == 5 && velocidade > 100) ||
                (marcha == 6 && velocidade > 120)) {
            System.out.println("Velocidade muito alta para reduzir marcha");
            return;
        }
        marcha--;
        System.out.println("Marcha reduzida para: " + marcha);
    }
}
