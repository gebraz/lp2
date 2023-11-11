public abstract  class Bebida {


    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    protected Fornecedor fornecedor;

    protected String nome;

    protected int estoque;

    protected double valor;

    public Bebida(Fornecedor fornecedor, String nome, int estoque, double valor) {
        this.fornecedor = fornecedor;
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
    }

    public String toString(){
        return  this.nome;
    }
}