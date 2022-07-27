package modelo;

public class Cono extends Figura
{
    //Atributos
    private double radioCono;
    private double alturaCono;

    //Constructor
    public Cono(double radioCono, double alturaCono)
    {
        this.radioCono = radioCono;
        this.alturaCono = alturaCono;
    }

    //Métodos
    public double getRadioCono() {
        return radioCono;
    }

    public void setRadioCono(double radioCono) {
        this.radioCono = radioCono;
    }

    public double getAlturaCono() {
        return alturaCono;
    }

    public void setAlturaCono(double alturaCono) {
        this.alturaCono = alturaCono;
    }

    public void calcularVolumenCono(double radioCono, double alturaCono)
    {
        nombreFigura = "Cono";
        volumenFigura = ((Math.PI*Math.pow(radioCono, 2)*alturaCono)/3);
    }

    public String toString()
    {
        return "Es un " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
