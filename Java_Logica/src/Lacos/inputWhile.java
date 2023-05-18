package Lacos;
import java.util.Scanner;
public class inputWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o primeiro valor");
        int i = input.nextInt();
        System.out.println("digite o último valor");
        int x = input.nextInt();
        System.out.println("digite o incremento");
        int incre = input.nextInt();
        while(i < x){
            System.out.println(i);
            i += incre;
        }
        System.out.println("Acabou !");
    }
}
