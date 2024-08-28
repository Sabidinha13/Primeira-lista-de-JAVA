import javax.swing.*;
import java.awt.*;

public class Ex2 {
    public static void main(String[] args) {

       String raio = JOptionPane.showInputDialog(null, "Digite o valor do raio: ");
       double ra = Double.parseDouble(raio);

       double area = Math.PI * ra * ra;

       JOptionPane.showMessageDialog(null, "Este é valor da área: " + area);

    }
}
