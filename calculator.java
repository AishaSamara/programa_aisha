import javax.swing.JOptionPane;

public class calculator_imc
{
    public static void main (String[] args)
    {
         String peso = JOptionPane.showInputDialog("Digite seu numero de peso");
         String altura =JOptionPane.showInputDialog(" Digite seu numero de altura");

         double numberpeso = Integer.parseint(peso);
         double numberaltura = Integer.parseint(altura);

         double imc = (numpeso/ (numaltura + numaltura));
          JOptionPane.showInputDialog (null, "Resultado de seu imc:" + String.format("%.if", imc), "Resultado do imc", JOptionPane.Plain_message);
    }
}