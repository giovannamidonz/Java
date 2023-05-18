package Decisao;
import java.util.Scanner;
public class TempoVida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ANO = 365;
        final int MENOSTEMPOVIDA = 10;
        System.out.println("Informe a Quantidades de cigarros fumados por dia : \n");
        double cigarros = input.nextDouble();
        System.out.println("Informe Quantos anos você já fumou : \n");
        int tempo = input.nextInt();

        double tempoMinutos = tempo * ANO * cigarros * MENOSTEMPOVIDA;

        double tempoDias = tempoMinutos / (24*60);

        System.out.println("O resultado é : " + tempoDias);


    input.close();
    }





}
