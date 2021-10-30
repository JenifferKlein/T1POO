public class Mouse extends Produto{
    private double dpi;
    private String conexaoMouse;

    public Mouse(int codProduto, String nomeProduto, double precoProduto, String marcaProduto, String modeloProduto, double dpi, String conexaoMouse) {
        super(codProduto, nomeProduto, precoProduto, marcaProduto, modeloProduto);
        this.dpi = dpi;
        this.conexaoMouse = conexaoMouse;
    }

    public double getDpi() {
        return dpi;
    }

    public void setDpi(double dpi) {
        this.dpi = dpi;
    }

    public String getConexaoMouse() {
        return conexaoMouse;
    }

    public void setConexaoMouse(String conexaoMouse) {
        this.conexaoMouse = conexaoMouse;
    }

    @Override
    void exibeDados() {
        super.exibeDados();
        System.out.println("  dpi: "+dpi);
        System.out.println("  Conexão do mouse: "+conexaoMouse);
    }
}
