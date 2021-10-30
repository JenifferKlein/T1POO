public class Produto { // classe pai dos produtos(armazenamewnto, cartucho, teclado e mouse)
    //variáveis
    private int codProduto;
    private String nomeProduto;
    private double precoProduto;
    private String marcaProduto;
    private String modeloProduto;
    //construtor
    public Produto(int codProduto, String nomeProduto, double precoProduto, String marcaProduto, String modeloProduto) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.marcaProduto = marcaProduto;
        this.modeloProduto = modeloProduto;
    }
    //getters e setters
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }


    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getModeloProduto() {
        return modeloProduto;
    }

    public void setModeloProduto(String modeloProduto) {
        this.modeloProduto = modeloProduto;
    }
    //vai mostrar 'bonitinho' os produtos pro usuário
    void exibeDados() {
        System.out.println("Produto");
        System.out.println("  Código do produto: "+ codProduto);
        System.out.println("  Nome do produto: " + nomeProduto);
        System.out.println("  Preço do Produto: " + precoProduto);
        System.out.println("  marca do Produto: " + marcaProduto);
        System.out.println("  modelo do Produto: " + modeloProduto);
    }
}
