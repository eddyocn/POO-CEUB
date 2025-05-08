public class Fornecedor extends Pessoa {
    private String produtosFornecidos;
    private String condicoesPagamento;

    public Fornecedor(String nome, String cpfCnpj, String endereco, String telefone, String email, String produtosFornecidos, String condicoesPagamento) {
        super(nome, cpfCnpj, endereco, telefone, email);
        this.produtosFornecidos = produtosFornecidos;
        this.condicoesPagamento = condicoesPagamento;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Produtos Fornecidos: " + produtosFornecidos);
        System.out.println("Condições de Pagamento: " + condicoesPagamento);
    }
}