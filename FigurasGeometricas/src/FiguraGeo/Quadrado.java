package FiguraGeo;

public class Quadrado extends Figura2d implements DimensaoSuperficial{
    private double bases;

    public Quadrado(double bases) {
        this.bases = bases;
    }

    public Quadrado() {
    }

    public double getBases() {
        return bases;
    }

    public void setBases(double bases) {
        this.bases = bases;
    }

    @Override
    public double calcularArea() {
        return bases * bases;
    }
}