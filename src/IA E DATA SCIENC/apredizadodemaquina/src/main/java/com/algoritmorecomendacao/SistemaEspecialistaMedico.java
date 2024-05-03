package com.algoritmorecomendacao;
import java.util.Scanner;
public class SistemaEspecialistaMedico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, descreva seus sintoma");
        String sintomas = sc.nextLine();

        String diagnostico = diagnosticarDoenca(sintomas);
        System.out.println("O diagnostico é: " + diagnostico);

    }
    private static String diagnosticarDoenca(String sintomas){
        if(sintomas.contains("Febre") && sintomas.contains("Tosse")){
        return "pode ser gripe";
        }else if(sintomas.contains("dor de cabela") && sintomas.contains("vomito")){
            return "Pode ser enxaqueca";
        }else if(sintomas.contains("Bronquinte") && sintomas.contains("Enfisema")){
            return "Pode ser Doença pulmonar";
        }else if(sintomas.contains("tosse com muco") && sintomas.contains("Falta de Ar") && sintomas.contains("febre")){
            return "Pode ser Pneumonia";
        }else if(sintomas.contains("chiado no peito") && sintomas.contains("Aperto no peito")){
            return "Pode ser Asma";
        }else if(sintomas.contains("Dor facial") && sintomas.contains("muco nasal")){
            return "Pode ser Sinusite";
        }else if(sintomas.contains("Dor facial") && sintomas.contains("Congestão nasal") && sintomas.contains("Sinusite Aguda")){
            return "Pode ser Sinusite";
        }else{
            return"Não foi possivel determinar a doença";
        }
    }
}

