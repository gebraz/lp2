public class Venda {

    public Venda(Bebida produto, int quant) {
        this.produto = produto;
        this.quant = quant;
    }

    public Bebida getProduto() {
        return produto;
    }

    public int getQuant() {
        return quant;
    }

    protected Bebida produto;
    protected int quant;


}
