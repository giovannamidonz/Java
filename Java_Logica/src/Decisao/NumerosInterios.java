package Decisao;
import java.util.Scanner;
public class NumerosInterios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número : ");
        int num1 = input.nextInt();
        System.out.println("Digite outro número : ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("primeiro valor é o maior : " + num1);
        }else if (num2 > num1){
            System.out.println("segundo valor é o maior : " + num2);
        }else{
            System.out.println("Não existe valor maior, os dois são iguais");
        }
    }
}
