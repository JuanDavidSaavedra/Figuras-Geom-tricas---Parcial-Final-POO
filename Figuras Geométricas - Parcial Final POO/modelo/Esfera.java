package modelo;

public class Esfera extends Figura
{
    //Atributos
    private double radio;

    //Constructor
    public Esfera(double radio)
    {
        this.radio = radio;
    }

    //Métodos
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularVolumenEsfera(double radio)
    {
        nombreFigura = "Esfera";
        volumenFigura = ((4/3)*Math.PI*Math.pow(radio, 3));
    }

    public String toString()
    {
        return "Es una " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
