package Atv_9_Aluno;

public class Aluno {
    String nome;
    String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void ExibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }
}
