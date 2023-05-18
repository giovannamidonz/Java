package POO.Entitade;
import java.util.Locale;
import java.util.Scanner;
public class AppPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Pensionato[] vetor = new Pensionato[10];

        System.out.println("Quantos quartos serão alugados ?");
        int n = input.nextInt();

        for(int a = 1 ; a < n; a++){
            System.out.println("Aluguel #"+a+":");
            System.out.println("Nome:");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Email: ");
            String email = input.next();
            System.out.println("Quarto: ");
            int numeroQuart = input.nextInt();
            vetor[numeroQuart] = new Pensionato(nome,email);
        }
        System.out.println();
        System.out.println("Compras dos Quartos");
        for(int i =0;i<10;i++){
            if (vetor[i] != null){
                System.out.println(i + ":" + vetor[i]);
            }

        }
        
        input.close();
    }
}
