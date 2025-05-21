public class TesteSistema {
    public static void main(String[] args) {
        Professor professor = new Professor("Denys Silva", "denys.silva");
        Aluno aluno1 = new Aluno("fulano", "202510");
        Atividade atividade1 = new Atividade("POO", " Protótipo de aplicativo pedagógico");
        Nota nota1 = new Nota(aluno1, atividade1, 10.0);

        GerenciadorCadastro gerenciadorCadastro = new GerenciadorCadastro();
        gerenciadorCadastro.cadastrarAluno(aluno1);
        gerenciadorCadastro.cadastrarAtividade(atividade1);

        SistemaLogin sistemaLogin = new SistemaLogin();
        boolean autenticado = sistemaLogin.autenticar("professor", "1234");

        System.out.println("Professor: " + professor.getNome());
        System.out.println("Aluno cadastrado: " + aluno1.getNome() + " - Matrícula: " + aluno1.getMatricula());
        System.out.println("Atividade cadastrada: " + atividade1.getTitulo() + " - " + atividade1.getDescricao());
        System.out.println("Nota lançada: " + nota1.getAluno().getNome() + " - " + nota1.getAtividade().getTitulo() + " - Nota: " + nota1.getValor());
        System.out.println("Login autenticado: " + (autenticado ? "Sim" : "Não"));
    }
}