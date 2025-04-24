package Atv_8_Produto;

public class Produto {
    String nome;
    Double preco;
    Double desconto;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public double aplicarDesconto(double percentual) {
        return desconto = preco - preco * (percentual/ 100);
    }
}
