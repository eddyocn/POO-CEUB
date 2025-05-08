public class Vendedor extends Empregado {
    private double comissao;
    private String metasVendas;

    public Vendedor(String nome, String cpfCnpj, String endereco, String telefone, String email, String cargo, double salario, String dataAdmissao, double comissao, String metasVendas) {
        super(nome, cpfCnpj, endereco, telefone, email, cargo, salario, dataAdmissao);
        this.comissao = comissao;
        this.metasVendas = metasVendas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Comissão: " + comissao);
        System.out.println("Metas de Vendas: " + metasVendas);
    }
}