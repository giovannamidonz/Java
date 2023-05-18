package AtividadeALdo;
import java.util.Date;

import java.time.LocalDate;
public class AppViagemVeiculo {

    public static void main(String[] args) {


        Date dataInicial = new Date(2023, 5, 15);
        LocalDate dataFinal = LocalDate.of(2023, 5, 20);



        Veiculo veiculo = new Veiculo(1, "ABC-1234", 10000);


        Viagem viagem = new Viagem(veiculo, 1, "Praia", dataInicial, dataFinal);


        boolean viagemIniciada = viagem.iniciarViagem(veiculo);
        if (viagemIniciada) {
            System.out.println("Viagem iniciada!");
        } else {
            System.out.println("Erro ao iniciar viagem.");
        }

        System.out.println("_________________________________________");
        System.out.println("Dados da viagem:");
        System.out.println("ID da viagem: " + viagem.getIdViagem());
        System.out.println("Destino: " + viagem.getDestino());
        System.out.println("Data inicial: " + viagem.getDataInicial());
        System.out.println("Data final: " + viagem.getDataFinal());

        System.out.println("_________________________________________");
        System.out.println("Dados do veículo:");
        System.out.println("ID do veículo: " + veiculo.getIdVeiculo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Odômetro: " + veiculo.getKmOdometro());
        System.out.println("Status: " + veiculo.getStatus());

        System.out.println("_________________________________________");
        viagem.finalizarViagem(10500);
        System.out.println("Viagem finalizada!");
        System.out.println("Km percorridos: " + viagem.getKmPecorrido());
        System.out.println("Odômetro: " + veiculo.getKmOdometro());
        System.out.println("Status: " + veiculo.getStatus());
    }
}
