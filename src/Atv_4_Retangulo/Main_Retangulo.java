package Atv_4_Retangulo;

import java.util.Scanner;

public class Main_Retangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Largura: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a Altura: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        System.out.println("A área do retangulo é: " + area);
        System.out.println("O Perimetro do retangulo é: " + perimetro);

    }
}