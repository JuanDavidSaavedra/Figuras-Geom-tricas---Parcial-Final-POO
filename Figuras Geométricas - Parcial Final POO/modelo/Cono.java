package modelo;

public class Cono extends Figura
{
    //Atributos
    private double radio;
    private double altura;

    //Constructor
    public Cono(double radio, double altura)
    {
        this.radio = radio;
        this.altura = altura;
    }

    //Métodos
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularVolumenCono(double radio, double altura)
    {
        nombreFigura = "Cono";
        volumenFigura = ((Math.PI*Math.pow(radio, 2)*altura)/3);
    }

    public String toString()
    {
        return "Es un " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
