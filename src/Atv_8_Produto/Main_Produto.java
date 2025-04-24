package Atv_8_Produto;

import java.util.Scanner;

public class Main_Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto("",0.00);
        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();
        System.out.println("Digite o Preço do Seu produto: ");
        produto.preco = scanner.nextDouble();
        System.out.println("Digite o percentual do desconto do produto: ");
        double desconto = scanner.nextDouble();

        double descontoAplicado = produto.aplicarDesconto(desconto);

        System.out.println("O Valor original da: " + produto.nome+" é R$ "+produto.preco);

        System.out.println("O valor do item: "+ produto.nome+" com desconto é R$" + descontoAplicado);

    }
}
