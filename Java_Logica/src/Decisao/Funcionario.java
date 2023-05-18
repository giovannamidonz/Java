package Decisao;
import java.util.Scanner;
public class Funcionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do Funcionario");
        String nome = input.nextLine();
        System.out.println("Informe o seu Salário");
        double salario = input.nextDouble();
        System.out.println("Informe quanto tempo trabalhando");
        int tempoTrabalhado = input.nextInt();
//Até 3 anos de empresa: aumento de 3%
// - entre 3 e 10 anos: aumento de 12.5%
// - 10 anos ou mais: aumento de 20
        if (tempoTrabalhado <= 3 ){
            double aumento = salario * (3/100);
            System.out.println("AUMENTO SALARIAL = " + (aumento+salario));
        }else if (tempoTrabalhado <= 10){
            double aumento = salario * (12.5/100);
            System.out.println("AUMENTO SALARIAL = " + (aumento+salario));
        }else{
            double aumento = salario * (20/100);
            System.out.println("AUMENTO SALARIAL = " + (aumento + salario));
        }
    }
}
