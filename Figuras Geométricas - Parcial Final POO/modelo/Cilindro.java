package modelo;

public class Cilindro extends Figura
{
    //Atributos
    private double radio;
    private double altura;

    //Constructor
    public Cilindro(double radio, double altura)
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

    public void calcularVolumenCilindro(double radio, double altura)
    {
        nombreFigura = "Cilindro";
        volumenFigura = Math.PI*Math.pow(radio, 2)*altura;
    }

    public String toString()
    {
        return "Es un " + nombreFigura + " y su volumen es: " + volumenFigura;
    }
}
