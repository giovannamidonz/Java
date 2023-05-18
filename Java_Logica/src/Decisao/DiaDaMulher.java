package Decisao;
import java.util.Scanner;
public class DiaDaMulher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char sexo;
        System.out.println("Informe o seu nome : ");
        String nome = input.nextLine();
        System.out.println("informe seu sexo : [F/M]");
        sexo = input.nextLine().charAt(0);

        if (sexo == 'f' || sexo == 'F'){
            System.out.println("Mulheres ganham 13% de desconto: "  );
            System.out.println("Digite o valor das suas compras !");
            double valorTotal = input.nextDouble();
            double valorDesconto = valorTotal * 13/100;
            System.out.println("Valor do desconto é : "+ (valorTotal-valorDesconto));
        }else if (sexo == 'm' || sexo == 'M'){
            System.out.println("Homens ganham 5% de desconto: "  );
            System.out.println("Digite o valor das suas compras !");
            double valorTotal = input.nextDouble();
            double valorDesconto = valorTotal * 5/100;
            System.out.println("Valor do desconto é : "+ (valorTotal-valorDesconto));
        }else{
            System.out.println("Valor errado ! digite novamente !");
        }
    }
}
