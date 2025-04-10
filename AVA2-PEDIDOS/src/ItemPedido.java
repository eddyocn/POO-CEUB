public class ItemPedido {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String codigoProduto, String descricaoProduto, int quantidade, double precoUnitario) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters e Setters
    public String getCodigoProduto() {
        return codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}