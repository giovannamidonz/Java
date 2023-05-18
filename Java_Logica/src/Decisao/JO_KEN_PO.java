package Decisao;
import java.util.Random;
import java.util.Scanner;
public class JO_KEN_PO {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Random opcao = new Random();

        int opcaoUsuario;
        int opcaoComputador;
        int pontoUsuario = 0;
        int pontosComputador = 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Informe a opção\n[1] papel\n[2] pedra\n[3] tesoura :");
            opcaoUsuario = input.nextInt();

            opcaoComputador = opcao.nextInt(3) + 1;
            switch (opcaoComputador) {
                case 1:
                    System.out.println("COMPUTADOR = papel");
                    break;
                case 2:
                    System.out.println("COMPUTADOR = pedra");
                    break;
                case 3:
                    System.out.println("COMPUTADOR = tesoura");
                    break;
            }
            if (opcaoUsuario == opcaoComputador) {
                System.out.println("EMPATE!");
            } else if ((opcaoUsuario - opcaoComputador) == -1 ||
                    (opcaoUsuario - opcaoComputador) == 2) {
                System.out.println("USUARIO VENCEDOR !");
                pontoUsuario +=1;
            } else {
                System.out.println("COMPUTADOR VENCEDOR! ");
                pontosComputador++;
            }
        }


        if(pontoUsuario > pontosComputador){
            System.out.println("usario Venceu! ");
        }else if (pontoUsuario < pontosComputador){
            System.out.println("computador Venceu!");
        }else {
            System.out.println("empate no jogo");
        }
    }
}
