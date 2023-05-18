package Decisao;
import java.util.Scanner;
public class Bissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano : ");
        int ano = input.nextInt();
        if ((ano %4 )==0){
            System.out.println("Ano e BISSEXTO!");
        }else {
            System.out.println("Ano não é BISSEXTO!");
        }
    }
}
