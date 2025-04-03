public class Pessoa {
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
    }

    private static double calcularImcPessoa(double peso, double altura) {
        return peso / (Math.pow(altura, 2));
    }

    private String obterAnaliseImc() {
        if (imcPessoa < 18.5) {
            return "Baixo peso. É recomendado procurar um médico para avaliação.";
        } else if (imcPessoa >= 18.5 && imcPessoa <= 24.9) {
            return "Peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros.";
        } else if (imcPessoa >= 25 && imcPessoa <= 29.9) {
            return "Sobrepeso. Consulte um médico e reveja hábitos para reverter o quadro.";
        } else if (imcPessoa >= 30 && imcPessoa <= 34.9) {
            return "Obesidade Grau I. Busque orientação médica e nutricional.";
        } else if (imcPessoa >= 35 && imcPessoa <= 39.9) {
            return "Obesidade Grau II. O quadro é mais evoluído, procure orientação médica.";
        } else {
            return "Obesidade Grau III. Risco elevado de doenças associadas, fundamental buscar ajuda médica.";
        }
    }

    public void mostrarImcPessoa() {
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("IMC: " + String.format("%.2f", this.imcPessoa));
        System.out.println("Análise: " + obterAnaliseImc());
    }
}
