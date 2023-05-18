package Decisao;
import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos KM voce deseja percoorer? ");
        double km = input.nextDouble();
        if (km <= 200){
            double precoViagem = km * 0.50;
            System.out.println("Valor da passagem é : " + precoViagem);
        }else{
            double precoViagem = km * 0.45;
            System.out.println("Valor da passagem é : " + precoViagem);
        }
    }
}
