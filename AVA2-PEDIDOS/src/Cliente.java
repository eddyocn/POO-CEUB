public class Cliente {
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente(String nomeCompleto, String cpf, String endereco, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}