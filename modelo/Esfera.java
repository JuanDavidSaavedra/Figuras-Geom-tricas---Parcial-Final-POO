package modelo;

public class Esfera extends Figura
{
    //Atributos
    private double radioEsfera;

    //Constructor
    public Esfera(double radioEsfera)
    {
        this.radioEsfera = radioEsfera;
    }

    //Métodos
    public double getRadioEsfera() {
        return radioEsfera;
    }

    public void setRadio(double radioEsfera) {
        this.radioEsfera = radioEsfera;
    }

    public void calcularVolumenEsfera(double radioEsfera)
    {
        nombreFigura = "Esfera";
        volumenFigura = ((4/3)*Math.PI*Math.pow(radioEsfera, 3));
    }

    public String toString()
    {
        return "Es una " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
