package Lacos;
import java.util.Scanner;
public class InteiroPositivo {
    public static void main(String[] args) {
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor :");
        int valor = input.nextInt();
        if(valor > 0 ){
            while (i <= valor){
                System.out.println(i);
                i++;
            }
        }else{
            System.out.println("DEu erro");
        }
    }
}
