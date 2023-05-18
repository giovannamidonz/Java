package Array;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] test = new int[10];
        for(int y = 0; y < test.length;y++){
            int cont = 0;

        System.out.println("informe o  "+cont+" numeros");
        test[0]= input.nextInt();
            cont +=1;
        }
        for (int j : test) {
            System.out.println("Seu numeros são: " + test[j]);
        }
    }

}
