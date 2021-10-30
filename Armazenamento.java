public class Armazenamento extends Produto { //classe filha do pai
    //variáveis
    private int capacidadeProduto;
    private String unidadeProduto;
    //mais um construtor
    public Armazenamento(int codProduto, String nomeProduto, double precoProduto, String marcaProduto, String modeloProduto, int capacidadeProduto, String unidadeProduto) {
        super(codProduto, nomeProduto, precoProduto, marcaProduto, modeloProduto);//chama pai
        this.capacidadeProduto = capacidadeProduto;
        this.unidadeProduto = unidadeProduto;
    }
    //getters e setters
    public int getCapacidadeProduto() {
        return capacidadeProduto;
    }

    public void setCapacidadeProduto(int capacidadeProduto) {
        this.capacidadeProduto = capacidadeProduto;
    }

    public String getUnidadeProduto() {
        return unidadeProduto;
    }

    public void setUnidadeProduto(String unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    @Override
    //mostra bonitinho²
    void exibeDados() {
        super.exibeDados();
        System.out.println("  Capacidade de armazenamento: "+capacidadeProduto+unidadeProduto);
    }
}
