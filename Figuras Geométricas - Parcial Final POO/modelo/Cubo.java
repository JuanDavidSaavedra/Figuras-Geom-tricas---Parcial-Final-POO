package modelo;

public class Cubo extends Figura
{
    //Atributos
    private double lado;

    //Constructor
    public Cubo(double lado)
    {
        this.lado = lado;
    }

    //Métodos
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calcularVolumenCubo(double lado)
    {
        nombreFigura = "Cubo";
        volumenFigura = lado*lado*lado;
    }

    public String toString()
    {
        return "Es un " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
