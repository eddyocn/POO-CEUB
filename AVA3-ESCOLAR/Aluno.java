import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

// Classe que representa um Aluno (Pessoa Física)
// Conforme diagrama: possui cpfPessoaFisica e dataNascimento.
public class Aluno extends Pessoa {
    private String cpfPessoaFisica;
    private Date dataNascimento;
    
    public Aluno() {
        super();
    }
    
    public Aluno(String nomePessoa, double vlrMensalidade, double percentualDesconto, 
                 String cpfPessoaFisica, Date dataNascimento) {
        super(nomePessoa, vlrMensalidade, percentualDesconto);
        this.cpfPessoaFisica = cpfPessoaFisica;
        this.dataNascimento = dataNascimento;
    }
    
    public String getCpfPessoaFisica() {
        return cpfPessoaFisica;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    // POLIMORFISMO (sobrescrita): Recebe os dados específicos do aluno, 
    // incluindo CPF e data de nascimento, além dos dados comuns.
    @Override
    public void entrarPessoa() {
        nomePessoa = JOptionPane.showInputDialog("Digite o nome do aluno:");
        cpfPessoaFisica = JOptionPane.showInputDialog("Digite o CPF do aluno:");
        
        // Lê a data de nascimento no formato dd/MM/yyyy.
        String dataStr = JOptionPane.showInputDialog("Digite a data de nascimento (dd/MM/yyyy):");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataNascimento = sdf.parse(dataStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Data inválida! Utilizando data atual.");
            dataNascimento = new Date();
        }
        
        vlrMensalidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mensalidade:"));
        // O percentual é informado como um número inteiro representando a porcentagem.
        percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto (ex: 1 para 1%):"));
    }
    
    // POLIMORFISMO (sobrescrita): Calcula o desconto para Aluno considerando somente o percentual.
    @Override
    public double calcularDesconto() {
        return vlrMensalidade * (percentualDesconto / 100);
    }
}
