package Atv_6_Circulo;

public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double CalcularArea() {
        return Math.PI * (raio * raio);
    }
    public double CalcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}
