package POO.Entitade;

public class Pneu {
    private int idPneu ;
    private String modelo;
    private double indiceDeUso;
    private char estado;
    private int horaDeUso;

    public Pneu(int idPneu, String modelo, double indiceDeUso) {
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeUso = indiceDeUso;
        this.estado = 'N';
        this.horaDeUso = 0;

    }

    public Boolean desgatar( int horaInicial , int horaFinal){
      final double INDECE_DESGASTE = 0.12345;
        if (this.estado == 'N' || this.estado == 'U'){
            if (this.estado == 'N'){
                this.estado = 'U';
            }
            int horas = horaFinal - horaInicial;
            this.indiceDeUso -= (horas) * 60 * INDECE_DESGASTE;
            if (this.indiceDeUso<=0){
                this.estado='F';
            }
            this.horaDeUso += horas;
            return true;
        }else{
            return false;
        }

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdPneu() {
        return idPneu;
    }

    public String getModelo() {
        return modelo;
    }

    public double getIndiceDeUso() {
        return indiceDeUso;
    }

    public char getEstado() {
        return estado;
    }

    public int getHoraDeUso() {
        return horaDeUso;
    }


}
