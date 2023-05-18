package Array;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=0;
        for(int z = 0; z <matriz.length;z++){
            System.out.println("informe os 6 valores : \n");
            matriz[a][b] = input.nextInt();

        }

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0 ; j < matriz.length;j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}
