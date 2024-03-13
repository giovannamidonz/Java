package Calculadora;

public class Calculadora {
    private double resultado = 0;
    

    public double soma( double n1,double n2 ){
        resultado = n1 + n2;
        return resultado;
    }
    
    public double subtrair(double n1,double n2){
        resultado = n1 - n2;
        if (n1 < 0 && n2 < 0){
            double somarSinaisDiferentes = n1 + n2;
            System.out.println(somarSinaisDiferentes);

        }
        return resultado;
    }

    public double multiplicar(double n1,double n2){
        resultado = n1 * n2;
        return resultado;
    }

    public double dividir(double n1,double n2){
        resultado = n1 / n2;
        return resultado;
    }


}
