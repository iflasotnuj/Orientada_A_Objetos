package Atv_7_Pessoa;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public int fazerAniversario() {
        return idade++;
    }
}
