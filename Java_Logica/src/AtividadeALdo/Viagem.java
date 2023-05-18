package AtividadeALdo;

import java.time.LocalDate;
import java.util.Date;

public class Viagem {

    private Veiculo veiculo;
    private int idViagem;
    private String destino;
    private Date dataInicial;
    private LocalDate dataFinal;
    private int kmPecorrido;

    public Viagem(Veiculo veiculo, int idViagem, String destino, Date dataInicial, LocalDate dataFinal) {
        this.veiculo = veiculo;
        this.idViagem = idViagem;
        this.destino = destino;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.kmPecorrido = 0; //não precisa mais declarei

    }


//metodos
    public boolean iniciarViagem(Veiculo veiculo){
       if(veiculo.getStatus() == 'V'){
           return false;
       }
        this.veiculo = veiculo;
        this.dataInicial = getDataInicial();
        this.veiculo.registrarViagem();
        return true;
    }

    public void finalizarViagem(int kmOdometro){
        this.kmPecorrido = kmOdometro - veiculo.getKmOdometro();
        this.dataFinal = LocalDate.now();
        this.veiculo.registrarRetorno(kmPecorrido);
    }
    public int calcularKmPecorrido(int kmOdometro){
        return this.kmPecorrido;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public String getDestino() {
        return destino;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public int getKmPecorrido() {
        return kmPecorrido;
    }
}
