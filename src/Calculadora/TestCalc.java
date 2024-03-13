package Calculadora;

public class TestCalc{
    
    public void firstSum() {
        Calculadora calc = new Calculadora();

        double n1 = 10, n2 = 5, resultExpected = 15.0, resultadoAtual;

        resultadoAtual = calc.soma(n1,n2);
        System.out.println("CTO1: Dois números inteiros positivos");
        if(resultadoAtual == resultExpected){
            System.out.println("o Teste passou!");
        }else{
            System.out.println("O teste falhou");
        }


    }

    public void secondSum(){
        Calculadora calc = new Calculadora();
        double n1 = -10, n2 = -5, resultExpected = -15 ,resultadoAtual;
        resultadoAtual = calc.soma(n1, n2);
        System.out.println("CTO1: Dois números inteiros negativos");
        if(resultadoAtual == resultExpected){
            System.out.println("o Teste passou!");
        }else{
            System.out.println("O teste falhou");
        }

    }
    public void thirdSum(){
        Calculadora calc = new Calculadora();
        double x = 10, y = 0, resultadoEsperado = 10.0, resultadoAtual;

        resultadoAtual = calc.soma(x, y);

        System.out.println("CT03: Um número inteiro positivo e zero");
        if(resultadoAtual == resultadoEsperado){
            System.out.println("O teste passou!");
        }else{
            System.out.println("O teste falhou!");
        }
    }

    public void fourthSum(){
        Calculadora calc = new Calculadora();
        double x = -10, y = 0, resultadoEsperado = -10.0, resultadoAtual;

        resultadoAtual = calc.soma(x, y);

        System.out.println("CT04: Um número inteiro negativo e zero");
        if(resultadoAtual == resultadoEsperado){
            System.out.println("O teste passou!");
        }else{
            System.out.println("O teste falhou!");
        }
    }

    public void fifthSum(){
        Calculadora calc = new Calculadora();
        double x = 10.5, y = 5.25, resultadoEsperado = 15.75, resultadoAtual;

        resultadoAtual = calc.soma(x, y);

        System.out.println("CT05: Dois números decimais positivos");
        if(resultadoAtual == resultadoEsperado){
            System.out.println("O teste passou!");
        }else{
            System.out.println("O teste falhou!");
        }
    }

    public void sixthSum(){
        Calculadora calc = new Calculadora();
        double x = -10.5, y = -5.25, resultadoEsperado = -15.75, resultadoAtual;

        resultadoAtual = calc.soma(x, y);

        System.out.println("CT06: Dois números decimais negativos");
        if(resultadoAtual == resultadoEsperado){
            System.out.println("O teste passou!");
        }else{
            System.out.println("O teste falhou!");
        }
    }

    public void seventhSum(){
        Calculadora calc = new Calculadora();
        double x = 10.5, y = 0, resultadoEsperado = 10.5, resultadoAtual;

        resultadoAtual = calc.soma(x, y);

        System.out.println("CT07: Um número decimal positivo e zero");
        if(resultadoAtual == resultadoEsperado){
            System.out.println("O teste passou!");
        }else{
            System.out.println("O teste falhou!");
        }
    }

    public void eighthSum(){
        Calculadora calc = new Calculadora();
        double x = -10.5, y = 0, resultadoEsperado = -10.5, resultadoAtual;

        resultadoAtual = calc.soma(x, y);

        System.out.println("CT08: Um número inteiro decimal e zero");
        if(resultadoAtual == resultadoEsperado){
            System.out.println("O teste passou!");
        }else{
            System.out.println("O teste falhou!");
        }
    }
   
}
