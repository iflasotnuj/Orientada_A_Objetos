package Atv_10_Triangulo;

public class Triangulo {
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base*altura/2);
    }
}
