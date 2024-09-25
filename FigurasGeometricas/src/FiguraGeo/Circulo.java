package FiguraGeo;

public class Circulo extends Figura2d implements DimensaoSuperficial{

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (raio * raio) * 3.14 ;
    }
}
