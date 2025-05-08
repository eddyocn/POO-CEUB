public class Pessoa {
    protected String nome;
    protected String cpfCnpj;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String cpfCnpj, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF/CNPJ: " + cpfCnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}