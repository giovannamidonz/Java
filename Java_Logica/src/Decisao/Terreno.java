package Decisao;
import java.util.Scanner;
public class Terreno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura : ");
        double altura = input.nextDouble();
        System.out.println("Digite o comprimento :");
        double comprimento = input.nextDouble();

        double area = comprimento * altura;

        if (area < 100 ){
            System.out.println("TERRENO POPULAR");
        }else if(area < 500){
            System.out.println("TERRENO MASTER");
        }else{
        System.out.println("TERRENO VIP");
        }
    }
}
