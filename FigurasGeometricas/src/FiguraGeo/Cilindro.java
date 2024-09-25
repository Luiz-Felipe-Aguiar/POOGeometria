package FiguraGeo;

public class Cilindro extends Figura3d implements DimensaoSuperficial, DimensaoVolumetrica{

    private double altura;
    private double raio;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (3.14 * (raio * raio)) * 2 * (3.14 * raio * altura);
    }

    @Override
    public double calcularvolume() {
        return (raio * raio) * altura * 3.14;
    }
}
