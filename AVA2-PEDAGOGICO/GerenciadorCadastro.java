import java.util.ArrayList;
import java.util.List;

public class GerenciadorCadastro {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Atividade> atividades = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}