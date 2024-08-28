import javax.swing.*;

public class Ex4 {
    public static void main(String[] args){


        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));

        int idade = 2024 - ano;

        JOptionPane.showMessageDialog(null, "Você se chama " + nome + " e possui " + idade + " anos de idade!");


    }
}
