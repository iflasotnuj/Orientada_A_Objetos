package Atv_10_Triangulo;

import java.util.Scanner;

public class Main_Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo = new Triangulo(0.00, 0.00);

        System.out.print("Digite a Base do Triangulo: ");
        triangulo.base = scanner.nextDouble();
        System.out.print("Digite a Altura do Triangulo: ");
        triangulo.altura = scanner.nextDouble();

        double area = triangulo.calcularArea();
        System.out.println("Area do Triangulo: " + area);

    }
}
