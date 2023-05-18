package Decisao;
import java.util.Scanner;
public class MaiorNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String nome = input.nextLine();
        System.out.println("Informe as duas notas do aluno");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2 )/ 2 ;
        System.out.println(media);
        if (media >= 7 ){
            System.out.println("Aprovado, teve um bom aproveitamento !");
        }else {
            System.out.println("Segunda chamada, não teve um bom aproveitamento");
        }
    }
}
