package AtividadeALdo;

public class Veiculo {
    private int idVeiculo;
    private String placa ;
    private char status;
    private int kmOdometro;

    public Veiculo(int idVeiculo, String placa, int kmOdometro) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.kmOdometro = kmOdometro;
        this.status = 'D';
    }

// metodos
    public void registrarViagem(){
        this.status = 'V';

    }
    public void registrarRetorno(int kmOdometro){
        this.kmOdometro += kmOdometro;
        this.status ='D';
    }

    public void revisar(){
        this.status = 'M';
    }


    public int getIdVeiculo() {
        return idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public char getStatus() {
        return status;
    }

    public int getKmOdometro() {
        return kmOdometro;
    }
}
