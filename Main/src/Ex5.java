import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o preço de venda do produto: ");
        double preco = sc.nextInt();

        System.out.println("Digite a porcentagem do desconto: ");
        double desconto = sc.nextInt();

        double valorDesconto = preco * (desconto / 100.0);
        double valorFinal = preco - valorDesconto;

        System.out.println("Produto: " + nome + "\nPreço de venda: " + preco + "\nPreço com desconto: " + valorFinal);
        sc.close();
    }
}
