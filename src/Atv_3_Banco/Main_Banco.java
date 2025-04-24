package Atv_3_Banco;

import java.util.Scanner;

public class Main_Banco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria("03061999",25.00);

        double valor;

        System.out.print("Digite um valor para depositar : ");
        valor = scanner.nextDouble();

        contaBancaria.depositar(valor);

        System.out.print("Digite um valor para saque : ");
        valor = scanner.nextDouble();

        if (valor <= contaBancaria.saldo) {

            contaBancaria.saque(valor);

        }else {

            System.out.println("Saldo insuficiente");

        }

        System.out.println("Saldo final : "+ contaBancaria.saldo);

    }
}

