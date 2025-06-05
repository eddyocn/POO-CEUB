import javax.swing.JOptionPane;

// Classe que representa uma Empresa (Pessoa Jurídica)
// Conforme diagrama: possui cnpjPessoaJuridica, inscricaoEstadual e quantidade de colaboradores.
public class Empresa extends Pessoa {
    private String cnpjPessoaJuridica;
    private String inscricaoEstadual;
    private int qtdColaboradores;
    
    public Empresa() {
        super();
    }
    
    public Empresa(String nomePessoa, double vlrMensalidade, double percentualDesconto, 
                   String cnpjPessoaJuridica, String inscricaoEstadual, int qtdColaboradores) {
        super(nomePessoa, vlrMensalidade, percentualDesconto);
        this.cnpjPessoaJuridica = cnpjPessoaJuridica;
        this.inscricaoEstadual = inscricaoEstadual;
        this.qtdColaboradores = qtdColaboradores;
    }
    
    public String getCnpjPessoaJuridica() {
        return cnpjPessoaJuridica;
    }
    
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    
    public int getQtdColaboradores() {
        return qtdColaboradores;
    }
    
    // POLIMORFISMO (sobrescrita): Recebe os dados específicos da empresa,
    // incluindo CNPJ, inscrição estadual, e quantidade de colaboradores.
    @Override
    public void entrarPessoa() {
        nomePessoa = JOptionPane.showInputDialog("Digite o nome da empresa:");
        cnpjPessoaJuridica = JOptionPane.showInputDialog("Digite o CNPJ da empresa:");
        inscricaoEstadual = JOptionPane.showInputDialog("Digite a inscrição estadual da empresa:");
        vlrMensalidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mensalidade:"));
        percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto (ex: 1 para 1%):"));
        qtdColaboradores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colaboradores:"));
    }
    
    // POLIMORFISMO (sobrescrita): Calcula o desconto para a Empresa utilizando somente o percentual.
    // Mesmo havendo o campo 'qtdColaboradores', este não será considerado no cálculo do desconto.
    @Override
    public double calcularDesconto() {
        return vlrMensalidade * (percentualDesconto / 100);
    }
}
