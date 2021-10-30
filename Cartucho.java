public class  Cartucho extends Produto{
    public String cor;
    public double quantidade;
    public String unidadeProduto;

    public Cartucho(int codProduto, String nomeProduto, double precoProduto, String marcaProduto, String modeloProduto, String cor, double quantidade, String unidadeProduto) {
        super(codProduto, nomeProduto, precoProduto, marcaProduto, modeloProduto);
        this.cor = cor;
        this.quantidade = quantidade;
        this.unidadeProduto = unidadeProduto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeProduto() {
        return unidadeProduto;
    }

    public void setUnidadeProduto(String unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    @Override
    void exibeDados() {
        super.exibeDados();
        System.out.println("  Cor: "+cor);
        System.out.println("  Capacidade: "+quantidade+unidadeProduto);
    }
}
