package AtividadeALdo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Revista {

        private int codigo;
        private String titulo;
        private int reciclagemProduzida;
        private List<Edicao> edicoes;


    public Revista(int codigo, String titulo) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.reciclagemProduzida = 0;
            this.edicoes = new ArrayList<>();
        }


        public List<Edicao> getEdicoes() {return edicoes; }
        public int getCodigo() {
            return codigo;
        }

        public String getTitulo() {
            return titulo;
        }

        public int getReciclagemProduzida() {
            return reciclagemProduzida;
        }

        public void adicionarEdicao(int nr, int trg, int qv) {
            edicoes.add(new Edicao(nr,trg,qv));
        }

        public void removerEdicao(Edicao edicao) {
            edicoes.remove(edicao);
        }

        public String reciclarEdicao(int nrEdicao) {
            for (int i = 0; i < edicoes.size(); i++) {
                if (edicoes.get(i).getNumero() == nrEdicao) {
                    if (edicoes.get(i).obterQtReciclagem() == 0) {
                        return "Não houve exemplares para reciclar.";
                    }else if(edicoes.get(i).getReciclou()) {
                        return "Edição Ja Reciclada!";
                    }else {
                        edicoes.get(i).reciclarExemplares();
                        reciclagemProduzida += edicoes.get(i).obterQtReciclagem();
                        return "Reciclagem Realizada!";
                    }
                }
            }return "Edição não encontrada.";
        }
}


