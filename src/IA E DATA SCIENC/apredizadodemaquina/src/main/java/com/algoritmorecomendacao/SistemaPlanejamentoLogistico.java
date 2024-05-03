package com.algoritmorecomendacao;

public class SistemaPlanejamentoLogistico {
    public static void main(String[] args) {
        // Dados fictícios de rotas e recursos disponíveis
        int distanciaRota1 = 100;
        int distanciaRota2 = 120;
        int tempoDisponivel = 8; // horas

        // Lógica para determinar a rota mais eficiente
        String rotaMaisEficiente = determinarRotaMaisEficiente(distanciaRota1, distanciaRota2, tempoDisponivel);

        System.out.println("Rota mais eficiente: " + rotaMaisEficiente);
    }

    private static String determinarRotaMaisEficiente(int distanciaRota1, int distanciaRota2, int tempoDisponivel) {
        // Lógica fictícia para determinar a rota mais eficiente
        if (distanciaRota1 < distanciaRota2 && distanciaRota1 <= tempoDisponivel) {
            return "Rota 1";
        } else if (distanciaRota2 < distanciaRota1 && distanciaRota2 <= tempoDisponivel) {
            return "Rota 2";
        } else {
            return "Nenhuma rota disponível dentro do tempo disponível";
        }
    }
}