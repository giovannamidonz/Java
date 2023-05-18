package Array;
import java.util.Scanner;
public class AppArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//start
        int num[] = new int[4];
        int acum = 0 ;
//variaveis
        for( int i =0; i < num.length; i++){
            System.out.printf("%dº número : ", (i+1));
            num[i] = input.nextInt();
            acum += num[i];
        }
        int media = acum/num.length;
        System.out.printf("\n Média: %dº\n", media);

        input.close();

    }
}
