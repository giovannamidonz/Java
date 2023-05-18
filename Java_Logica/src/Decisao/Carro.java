package Decisao;
import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /* entrada
    velocidade do carro;
    codicao
    if velocidade >= 80km/h print <- multado
    else print <- ok tudo certo

    calculo if velocidade >= 80km/h <- (80 - velocidade )*5
     */

        System.out.println("Informe a velocidade do carro ");
        int kmH = scan.nextInt();
        double calcuMulta = (80 - kmH) *5;
        if (kmH > 80) {
            System.out.println("Voce será multado!\n VALOR da MULTA : "+ calcuMulta);

        }else{
            System.out.println("OK! tudo Certo!");
        }
    }
}
