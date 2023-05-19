package Decisao;
import java.util.Scanner;
public class EmpBancario {
        //emprestimo bancario
    
        public static void main(String[] args) {
        //if o empretismo ta aprovado ou reprovado para compra
            // pedimos <-- valor da casa; salario; anos do pagamento;
            //codição o prestação mensal nao pode ser 30% do salario
            Scanner input = new Scanner(System.in);
            final int juros = 5;
            System.out.println("Informe o valor da Casa que deseja comprar : ")
            double valorCasa = input.nextDouble();
            System.out.println("Informe o Seu Salário: ")
            double scalarioComprador = input.nextDouble();
            System.out.println("Em quantos anos você pretende pagar ? ")
            int anosPagamento = input.nextInt();
    
            int meses = anosPagamento*12; 
            double calculoPrestacaoMensal =valorCasa/meses  ;
            double limeteSalario = salarioComprador *0.3;
            if (calculoPrestacaoMensal > limiteSalario){
                System.out.println("Emprestimo reprovado!")
            else{
                System.out.println("Emprestimo Aprovado!" + calculoPrestacaoMensal)
                }
                
                
            }
        }
    
}
