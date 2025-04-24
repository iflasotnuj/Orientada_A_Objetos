package Atv_9_Aluno;

import java.util.Scanner;

public class Main_Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno("", "");
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite a matricula do aluno: ");
        aluno.matricula = scanner.nextLine();

        System.out.println("O Nome do aluno é " + aluno.nome + ".");
        System.out.println("O Matricula é " + aluno.matricula);

    }
}
