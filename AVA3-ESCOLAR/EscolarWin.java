import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

// Classe principal que utiliza a interface gráfica (Swing) para coletar os dados.
public class EscolarWin {
    public static void main(String[] args) {
        String[] opcoes = {"Aluno", "Empresa"};
        int escolha = JOptionPane.showOptionDialog(null,
                "Selecione o tipo de cadastro:",
                "Cadastro de Pessoa",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        
        Pessoa pessoa = null;
        if (escolha == 0) {
            pessoa = new Aluno();
        } else if (escolha == 1) {
            pessoa = new Empresa();
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
            System.exit(0);
        }
        
        // Coleta dos dados via método polimórfico entrarPessoa()
        pessoa.entrarPessoa();
        
        // Cálculo do desconto utilizando a implementação específica da subclasse
        double desconto = pessoa.calcularDesconto();
        
        // Monta a mensagem para exibir os dados cadastrados e o desconto.
        String mensagem = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (pessoa instanceof Aluno) {
            Aluno aluno = (Aluno) pessoa;
            mensagem += "Cadastro de Aluno realizado:\n" +
                        "Nome: " + aluno.getNomePessoa() + "\n" +
                        "CPF: " + aluno.getCpfPessoaFisica() + "\n" +
                        "Data de Nascimento: " + sdf.format(aluno.getDataNascimento()) + "\n" +
                        "Valor Mensalidade: " + aluno.getVlrMensalidade() + "\n" +
                        "Percentual de Desconto: " + aluno.getPercentualDesconto() + "%\n" +
                        "Valor do Desconto: " + desconto;
        } else if (pessoa instanceof Empresa) {
            Empresa empresa = (Empresa) pessoa;
            mensagem += "Cadastro de Empresa realizado:\n" +
                        "Nome: " + empresa.getNomePessoa() + "\n" +
                        "CNPJ: " + empresa.getCnpjPessoaJuridica() + "\n" +
                        "Inscrição Estadual: " + empresa.getInscricaoEstadual() + "\n" +
                        "Valor Mensalidade: " + empresa.getVlrMensalidade() + "\n" +
                        "Percentual de Desconto: " + empresa.getPercentualDesconto() + "%\n" +
                        "Quantidade de Colaboradores: " + empresa.getQtdColaboradores() + "\n" +
                        "Valor do Desconto: " + desconto;
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
