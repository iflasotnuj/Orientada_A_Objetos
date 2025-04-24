package Atv_7_Pessoa;
import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner sccanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("", 0);
               System.out.println("Digite o seu nome: ");
               pessoa.nome = sccanner.nextLine();
               System.out.println("Digite o sua idade: ");
               pessoa.idade = sccanner.nextInt();

               System.out.println("Idade de: " + pessoa.nome+" é "+pessoa.idade);

               pessoa.fazerAniversario();

               System.out.println("A nova Idade de: "+pessoa.nome+" é "+pessoa.idade);
    }
}
