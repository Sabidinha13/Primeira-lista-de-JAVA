import java.util.Scanner;

public class Ex1 {
        public static void main(String[] args){

            int x; int s=0;
            int v[] = new int[5];

            Scanner ler = new Scanner(System.in);

            for(x=0; x<5; x++){
                System.out.println("Digite os números para ser realizada a média aritmética:");
                v[x] = ler.nextInt();

                s=s+v[x];

            }
            System.out.println("A média é: " + s/5);
            for(x=0; x<5; x++){
                System.out.println("Os números digitados foram/n" + v[x]);
            }
        }
    }

