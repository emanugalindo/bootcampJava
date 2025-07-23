package exercicios.exercicio9;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private final double chequeEspecialInicial;
    private double valorUsadoCheque;

    public Conta(double saldo) {
        this.saldo = saldo;
        if (this.saldo <= 500) chequeEspecial = 50;
        else chequeEspecial = saldo * 0.5;
        chequeEspecialInicial = chequeEspecial;
    }

    public void consultarSaldo() {
        System.out.printf(String.format("Saldo: R$%.2f\n", saldo));
    }

    public void consultarChequeEspecial() {
        System.out.printf(String.format("Cheque especial: R$%.2f\n", chequeEspecial));
    }

    public void depositar(double deposito) {
        saldo += deposito;
        double valorUsado = chequeEspecialInicial - chequeEspecial;

        if (saldo > 0 && valorUsado > 0) {
            double valorRecomposto = Math.min(valorUsado, deposito);
            chequeEspecial += valorRecomposto;

            double taxa = valorUsado * 0.2;
            saldo -= taxa;
            System.out.println("Foi aplicada a taxa de 20% do cheque especial");
        }
    }

    public void sacar(double saque) {
        if (saldo >= saque) saldo -= saque;
        else if (chequeEspecial + saldo >= saque){
            valorUsadoCheque = saque - saldo;
            chequeEspecial -= valorUsadoCheque;
            saldo = -valorUsadoCheque;
        }
        else System.out.println("Não é possível realizar o saque");
    }

    public void pagarBoleto(double valorBoleto) {
        if (saldo >= valorBoleto)saldo -= valorBoleto;
        else if (chequeEspecial + saldo >= valorBoleto){
            valorUsadoCheque = valorBoleto - saldo;
            chequeEspecial -= valorUsadoCheque;
            saldo = -valorUsadoCheque;
            consultarSaldo();
        }
        else System.out.println("Não é possível pagar o boleto");
    }

    public boolean estaUsandoChequeEspecial() {
        return saldo <= 0;
    }
}
