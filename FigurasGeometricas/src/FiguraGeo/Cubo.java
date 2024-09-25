package FiguraGeo;

public class Cubo extends Figura3d implements DimensaoSuperficial, DimensaoVolumetrica{

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado * lado);
    }

    @Override
    public double calcularvolume() {
        return lado * lado * lado;
        //Math.pow(3);
    }
}