package FiguraGeo;

public class Teste {
    public static void main(String[] args) {
        //Instancia Quadrado
        Quadrado quadrado = new Quadrado();
        quadrado.setBases(6);
        System.out.println(quadrado.calcularArea());
        quadrado.setNome("Quadrado");

        //Instancia Circulo
        Circulo circulo = new Circulo();
        circulo.setRaio(4);
        System.out.println(circulo.calcularArea());
        circulo.setNome("Circulo");

        //instacia triangulo
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(4);
        triangulo.setAltura(5);
        System.out.println(triangulo.calcularArea());
        triangulo.setNome("Triangulo");

        //instancia cubo
        Cubo cubo = new Cubo();
        cubo.setLado(4);
        System.out.println("Cubo " + cubo.calcularArea());
        System.out.println("Cubo " +cubo.calcularvolume());
        cubo.setNome("Cubo");

        //instancia Cilindro
        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(8);
        cilindro.setRaio(4);
        System.out.println("Cilindro " + cilindro.calcularArea());
        System.out.println("Cilindro " + cilindro.calcularvolume());
        cilindro.setNome("Cilindro");

        //instancia Piramide
        Piramide piramide = new Piramide();
        piramide.setAltura(9);
        piramide.setApotema(5);
        piramide.setBase(quadrado);
        piramide.setArestaBase(4);
        piramide.setNumPoliBase(4);
        System.out.println("Piramide " + piramide.calcularArea());
        System.out.println("Piramide " + piramide.calcularvolume());
        piramide.setNome("Piramide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        // for ( tipo nomeVariavel : vetorSendo iterado)
        for (FiguraGeometrica figura : figuras){
            System.out.println("-----------------------");
            System.out.println("Figura: " + figura.getNome());
            if (figura instanceof Figura2d){
                Figura2d f2d = (Figura2d) figura;
                System.out.println("Area: " + f2d.calcularArea());
            }
            if (figura instanceof Figura3d) {
                Figura3d f3d = (Figura3d) figura;
                System.out.println("Area: " + f3d.calcularArea());
                System.out.println("Volume: " + f3d.calcularvolume());
            }
        }


    }
}
