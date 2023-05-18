package Decisao;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Pastelaria-----");
        System.out.println("1 - BOLOS               \n");
        System.out.println("2 - TORTAS              \n");
        System.out.println("3 - SALGADOS            \n");
        System.out.println("4 - FALAR COM O GERENTE \n");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Qual sabor você deseja ?");
                System.out.println("1 - morango               \n");
                System.out.println("2 - brigadeiro             \n");
                System.out.println("4 - prestigio             \n");
                int sabor = input.nextInt();

                switch (sabor){
                    case 1 :
                        System.out.println("morango escolhido");
                        break;
                    case 2 :
                        System.out.println("brigeiro escolhido");
                        break;
                    case 3 :
                        System.out.println("prestigio escolhido");
                        break;
                }
            case 2 :
                System.out.println("Qual torta voce deseja ?");
                System.out.println("1 - morango               \n");
                System.out.println("2 - brigadeiro             \n");
                System.out.println("4 - prestigio             \n");

                int saborTorta = input.nextInt();

                switch (saborTorta){
                    case 1 :
                        System.out.println("morango escolhido");
                        break;
                    case 2 :
                        System.out.println("brigeiro escolhido");
                        break;
                    case 3 :
                        System.out.println("prestigio escolhido");
                        break;
                    default:
                        System.out.println("opção invalida!");
                        break;

                }
            case 3 :
                System.out.println("Qual o salgado voce quer ?");
                System.out.println("1 - coxinha de frango");
                System.out.println("2 - bolinho de carne");
                int saborSalgado = input.nextInt();

                switch (saborSalgado){
                    case 1 :
                        System.out.println("coxinha escolhida");
                    case 2 :
                        System.out.println("bolinho escolhido");
                        break;
                    default:
                        System.out.println("opção invalida!");
                        break;
                }
            case 4 :
                System.out.println("Voce chamou o gerente, aguarde um pouco !");
                break;
            default:
                System.out.println("opção invalida!");
                break;
        }



    }
}
