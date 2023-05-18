package POO.Entitade;
import java.util.Scanner;
public class AppEstoque {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quantos produtos você irá adicionar?");
        int n = input.nextInt();
        for(int i = 0; i < n ; i++) {
            System.out.println("Informe o código do Produto : ");
            int idCodigo = input.nextInt();
            System.out.println("Informe o nome do Produto :");
            String idNome = input.nextLine();
            Estoque estoque = new Estoque(idCodigo, idNome);
        }


    }
}
