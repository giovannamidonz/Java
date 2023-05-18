package Lacos;
import java.util.Scanner;
public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 6 ;
        while (i <=11){
            System.out.println(i);
            i++;
        }
        System.out.println("acabou");
        System.out.println();
        System.out.println("----------------------");

        int y = 10;
        while (y >= 3){
            System.out.println(y);
            y--;
        }
        System.out.println("acabou");
        System.out.println();
        System.out.println("----------------------");

        int x = 0;
        while (x <= 18){
            System.out.println(x);
            x += 3;
        }
        System.out.println("Acabou");
        System.out.println();
        System.out.println("----------------------");

        int cont = 100;
        while(cont>= 0){
            System.out.println(cont);
            cont -= 5;
        }
        System.out.println("Fim");
    }


}
