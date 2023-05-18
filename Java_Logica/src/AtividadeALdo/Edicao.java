package AtividadeALdo;
import java.util.Date;
public class Edicao {

        private int numero;
        private Date data;
        private int tiragem;
        private int qtdeVendida;
        private boolean reciclou;

        public Edicao(int numero, int tiragem, int qtdeVendida) {
            this.numero = numero;
            this.tiragem = tiragem;
            this.qtdeVendida = qtdeVendida;
            this.reciclou = false;
            this.data = new Date();
        }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public int getNumero() {
            return numero;
        }

        public Date getData() {
            return data;
        }

        public int getTiragem() {
            return tiragem;
        }

        public int getQtdeVendida() {
            return qtdeVendida;
        }

        public boolean getReciclou() {
            return false;
        }


        public void reciclarExemplares() {
                this.reciclou = true;
            }

            public int obterQtReciclagem() {
                return this.tiragem - this.qtdeVendida;
            }

 }


