public class Teclado extends Produto{//+uma classe filha
    //variáveis
    private String tipoTeclado;
    private String conexaoTeclado;
    //construtor
    public Teclado(int codProduto, String nomeProduto, double precoProduto, String marcaProduto, String modeloProduto, String tipoTeclado, String conexaoTeclado) {
        super(codProduto, nomeProduto, precoProduto, marcaProduto, modeloProduto); //chama pai
        this.tipoTeclado = tipoTeclado;
        this.conexaoTeclado = conexaoTeclado;
    }
    //getters e setters
    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }
    public String getConexaoTeclado() {
        return conexaoTeclado;
    }

    public void setConexaoTeclado(String conexaoTeclado) {
        this.conexaoTeclado = conexaoTeclado;
    }

    @Override
    // mostra bonitinho³
    void exibeDados() {
        super.exibeDados();
        System.out.println("  Tipo do teclado: "+tipoTeclado);
        System.out.println("  Conexão do teclado: "+conexaoTeclado);
    }
}
