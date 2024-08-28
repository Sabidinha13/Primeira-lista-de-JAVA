import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.println("Digite o valor da hora: ");
        double valorHoras = sc.nextDouble();

        double salario = horas * valorHoras;

        System.out.println("O salário é: " + salario);
        System.out.println(new DecimalFormat("0.00").format(salario));

        sc.close();
    }
}