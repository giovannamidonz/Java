package Decisao;
import java.util.Scanner;
public class Votacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int anoAtual = 2023;
    System.out.println("Informe a sua idade de nascimento ");
    int nascimento = input.nextInt();

    int calcIdade = anoAtual - nascimento ;

    if (calcIdade >= 16){
            System.out.println("pode Votar!");
        }else {
            System.out.println("Não Pode Votar! ");
        }
    input.close();
    }
}
