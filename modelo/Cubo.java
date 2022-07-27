package modelo;

public class Cubo extends Figura
{
    //Atributos
    private double ladoCubo;

    //Constructor
    public Cubo(double ladoCubo)
    {
        this.ladoCubo = ladoCubo;
    }

    //Métodos
    public double getLadoCubo() {
        return ladoCubo;
    }

    public void setLado(double ladoCubo) {
        this.ladoCubo = ladoCubo;
    }

    public void calcularVolumenCubo(double ladoCubo)
    {
        nombreFigura = "Cubo";
        volumenFigura = ladoCubo*ladoCubo*ladoCubo;
    }

    public String toString()
    {
        return "Es un " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
