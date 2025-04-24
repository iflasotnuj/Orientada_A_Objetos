package Atv_3_Banco;

public class ContaBancaria {
    String numeroConta;
    Double saldo;

    public ContaBancaria(String numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public Double depositar(double valor) {
        return saldo = saldo + valor;
    }
    public Double saque(double valor) {
        return saldo = saldo - valor;
    }
}
