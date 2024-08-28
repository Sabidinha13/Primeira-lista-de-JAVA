import javax.swing.*;

public class Ex6 {
    public static void main(String[] args) {

        String salario = JOptionPane.showInputDialog("Informe o valor do salário: ");
        double sal = Double.parseDouble(salario);

        double valorReajuste = sal * (15 / 100.0);
        double valorSalario = valorReajuste + sal;

        JOptionPane.showMessageDialog(null, "Este é o valor do salário antigo, " + sal + " e este é o valor com o salário reajustado " + valorSalario);


    }
}
