public class UsuarioSistema extends Pessoa {
    private String login;
    private String senha;
    private String nivelAcesso;

    public UsuarioSistema(String nome, String cpfCnpj, String endereco, String telefone, String email, String login, String senha, String nivelAcesso) {
        super(nome, cpfCnpj, endereco, telefone, email);
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Login: " + login);
        System.out.println("Nível de Acesso: " + nivelAcesso);
    }
}