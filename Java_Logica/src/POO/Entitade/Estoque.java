package POO.Entitade;

public class Estoque {
    private int codigo;
    private String nome;
    private int estoque;
    private double valorUnitario;
    
    public Estoque(int codigo, String nome){
        
        this.codigo = codigo; 
        this.nome = nome;
        
    }
    //void atrbuindo ao estoque
     
    public void incluirEstoque(int quant ){
        this.estoque += quant;
    }

    // boolean diminuindo ao estoque
    public boolean diminuirEstoque(int quant ){
        if (quant < this.estoque){
            this.estoque -= quant;
            return true;
        }
        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}
