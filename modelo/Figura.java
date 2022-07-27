package modelo;

public class Figura
{
    //Atributos
    protected String nombreFigura;
    protected double volumenFigura;

    //Métodos
    public Figura()
    {
    }

    public Figura(String nF, double vF)
    {
        this.nombreFigura = nF;
        this.volumenFigura = vF;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public double getVolumenFigura() {
        return volumenFigura;
    }

    public void setVolumenFigura(double volumenFigura) {
        this.volumenFigura = volumenFigura;
    }

    public String toString()
    {
        return "El nombre de la figura es: " + nombreFigura + " y su volumen es: " + volumenFigura;
    }

    

}