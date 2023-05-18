package Decisao;
import java.util.Scanner;
public class Alistamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ANOATUAL = 2023;
        final int OBRIGATORIO = 18;
        System.out.println("Digite o ano de nascimento : ");
        int nascimento = input.nextInt();

        int idade = ANOATUAL - nascimento;

        if (idade > OBRIGATORIO ){
            int passou = idade - OBRIGATORIO;
            System.out.println(passou);
        }else{
            int resta = idade - OBRIGATORIO;
            System.out.println(resta);

        }

    input.close();
    }
}
