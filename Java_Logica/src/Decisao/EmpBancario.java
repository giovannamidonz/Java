import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
            System.out.println("Informe o valor da Casa que deseja comprar : ");
            double valorCasa = input.nextDouble();
            System.out.println("Informe o Seu Salário: ");
            double salarioComprador = input.nextDouble();
            System.out.println("Em quantos anos você pretende pagar ? ");
            int anosPagamento = input.nextInt();
            
            int meses = anosPagamento*12; 
            
            double calculoPrestacaoMensal =valorCasa/meses ;
            
            double limiteSalario = salarioComprador *0.3;
            if (calculoPrestacaoMensal > limiteSalario){
                System.out.println("Emprestimo reprovado!");
            }else{
                System.out.println("Emprestimo Aprovado!" + calculoPrestacaoMensal);
                }
	}
}
