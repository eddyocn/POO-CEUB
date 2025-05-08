public class Cliente extends Pessoa {
    private double limiteCredito;
    private String historicoCompras;

    public Cliente(String nome, String cpfCnpj, String endereco, String telefone, String email, double limiteCredito, String historicoCompras) {
        super(nome, cpfCnpj, endereco, telefone, email);
        this.limiteCredito = limiteCredito;
        this.historicoCompras = historicoCompras;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite de Crédito: " + limiteCredito);
        System.out.println("Histórico de Compras: " + historicoCompras);
    }
}