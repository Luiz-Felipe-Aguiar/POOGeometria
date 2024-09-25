package FiguraGeo;

public class Piramide extends Figura3d implements DimensaoSuperficial, DimensaoVolumetrica{

    private double altura;
    private double arestaBase;
    private double apotema;
    private double numPoliBase;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2d getBase() {
        return base;
    }

    public void setBase(Figura2d base) {
        this.base = base;
    }

    private Figura2d base;

    public double getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(double numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    @Override
    public double calcularArea() {
        if (base != null){
           return ((numPoliBase * (arestaBase * apotema)) / 2) +  base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularvolume() {
        if (base != null){
            return (base.calcularArea() * altura) / 3;
        }
        return 0;
    }
}
