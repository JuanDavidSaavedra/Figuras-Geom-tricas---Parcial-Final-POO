package modelo;

public class Cilindro extends Figura
{
    //Atributos
    private double radioCilindro;
    private double alturaCilindro;

    //Constructor
    public Cilindro(double radioCilindro, double alturaCilindro)
    {
        this.radioCilindro = radioCilindro;
        this.alturaCilindro = alturaCilindro;
    }

    //Métodos
    public double getRadioCilindro() {
        return radioCilindro;
    }

    public void setRadioCilindro(double radioCilindro) {
        this.radioCilindro = radioCilindro;
    }

    public double getAlturaCilindro() {
        return alturaCilindro;
    }

    public void setAlturaCilindro(double alturaCilindro) {
        this.alturaCilindro = alturaCilindro;
    }

    public void calcularVolumenCilindro(double radioCilindro, double alturaCilindro)
    {
        nombreFigura = "Cilindro";
        volumenFigura = Math.PI*Math.pow(radioCilindro, 2)*alturaCilindro;
    }

    public String toString()
    {
        return "Es un " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
