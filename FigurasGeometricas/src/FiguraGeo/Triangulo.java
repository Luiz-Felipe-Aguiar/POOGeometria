package FiguraGeo;

public class Triangulo extends Figura2d implements DimensaoSuperficial{
    private double base;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (altura * base) / 2;
    }
}
