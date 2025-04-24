package Atv_6_Circulo;
import java.util.Scanner;

public class Main_Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o Raio do circulo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);

        double area = circulo.CalcularArea();
        double circuferencia = circulo.CalcularCircunferencia();

        System.out.println("O area do circulo é: " + area);
        System.out.println("A Circuferencia do circulo é: "+ circuferencia);

    }
}
