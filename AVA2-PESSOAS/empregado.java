public class Empregado extends Pessoa {
    private String cargo;
    private double salario;
    private String dataAdmissao;

    public Empregado(String nome, String cpfCnpj, String endereco, String telefone, String email, String cargo, double salario, String dataAdmissao) {
        super(nome, cpfCnpj, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Admissão: " + dataAdmissao);
    }
}