package ejecutable;

import javax.swing.JOptionPane;
import modelo.Cilindro;
import modelo.Cubo;
import modelo.Esfera;
import modelo.Cono;

public class test
{
    //Método principal
    public static void main(String[] args)
    {
        //Entrada de datos
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado del cubo: "));
        double radioC = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio del cilindro: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura del cilindro: "));
        double radioCo = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio del cono: "));
        double alturaCo = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura del cono: "));
        double radioE = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio de la esfera: "));

        //Creación de un objeto Cubo
        Cubo miCubo= new Cubo(lado);
        miCubo.calcularVolumenCubo(lado);
        JOptionPane.showMessageDialog(null, miCubo);

        //Creación de un objeto Cilindro
        Cilindro miCilindro = new Cilindro(radioC, altura);
        miCilindro.calcularVolumenCilindro(radioC, altura);
        JOptionPane.showMessageDialog(null, miCilindro);

        //Creación de un objeto Cono
        Cono miCono = new Cono(radioCo, alturaCo);
        miCono.calcularVolumenCono(radioCo, alturaCo);
        JOptionPane.showMessageDialog(null, miCono);

        //Creación de un objeto Esfera
        Esfera miEsfera = new Esfera(radioE);
        miEsfera.calcularVolumenEsfera(radioE);
        JOptionPane.showMessageDialog(null, miEsfera);
    }
}