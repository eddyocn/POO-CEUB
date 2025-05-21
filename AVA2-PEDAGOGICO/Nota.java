public class Nota {
    private Aluno aluno;
    private Atividade atividade;
    private double valor;

    public Nota(Aluno aluno, Atividade atividade, double valor) {
        this.aluno = aluno;
        this.atividade = atividade;
        this.valor = valor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public double getValor() {
        return valor;
    }
}