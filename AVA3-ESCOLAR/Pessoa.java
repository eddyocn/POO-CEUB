// Classe abstrata que define os atributos comuns e os métodos abstratos
// para entrada dos dados e cálculo do desconto.
public abstract class Pessoa {
    protected String nomePessoa;             // Conforme diagrama: nomePessoa
    protected double vlrMensalidade;         // Utilizado na fórmula de desconto
    protected double percentualDesconto;     // Informado como número inteiro (ex.: 1 para 1%)

    public Pessoa() { }

    public Pessoa(String nomePessoa, double vlrMensalidade, double percentualDesconto) {
        this.nomePessoa = nomePessoa;
        this.vlrMensalidade = vlrMensalidade;
        this.percentualDesconto = percentualDesconto;
    }
    
    // Getters para acesso aos atributos.
    public String getNomePessoa() {
        return nomePessoa;
    }
    
    public double getVlrMensalidade() {
        return vlrMensalidade;
    }
    
    public double getPercentualDesconto() {
        return percentualDesconto;
    }
    
    // Método abstrato para entrada dos dados.
    public abstract void entrarPessoa();
    
    // Método abstrato para cálculo do desconto.
    public abstract double calcularDesconto();
}
