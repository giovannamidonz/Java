package com.algoritmorecomendacao;
import java.util.ArrayList;
import java.util.List;

public class SistemaRecomendacaoFilmes {
    public static void main(String[] args) {
    List<String> filmesAssistidos = new ArrayList<>();
    filmesAssistidos.add("Matrix");
    filmesAssistidos.add("O senhor dos Aneis");
    List<String> generosPreferidos = new ArrayList<>();
    generosPreferidos.add("Ficção Cientifica");
    List<String>recomendacoes = recomendarFilmes(filmesAssistidos,generosPreferidos);

    System.out.println("Filmes recomendados");
    for(String filme: recomendacoes){
        System.out.println(filme);
    }
}
private static List<String> recomendarFilmes(List <String>filmesAssistidos,List<String> generosPreferidos){
    List<String> recomendacoes = new ArrayList<>();
    recomendacoes.add("Interestelar");
    recomendacoes.add("Blade Runner 2049");
    return recomendacoes;

    }
}