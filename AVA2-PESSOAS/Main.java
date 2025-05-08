public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", "Rua A, 123", "99999-9999", "joao@email.com", 5000.0, "Compras recentes");
        Fornecedor fornecedor = new Fornecedor("Empresa XYZ", "12.345.678/0001-99", "Av. B, 456", "88888-8888", "contato@xyz.com", "Eletrônicos", "30 dias");
        Empregado empregado = new Empregado("Maria Souza", "987.654.321-00", "Rua C, 789", "77777-7777", "maria@email.com", "Analista", 4500.0, "01/01/2020");
        Vendedor vendedor = new Vendedor("Carlos Lima", "654.321.987-00", "Rua D, 321", "66666-6666", "carlos@email.com", "Vendedor", 3000.0, "15/05/2019", 10.0, "Meta de 100 vendas/mês");
        UsuarioSistema usuario = new UsuarioSistema("Admin", "000.000.000-00", "Rua E, 555", "55555-5555", "admin@email.com", "admin", "123456", "Administrador");

        System.out.println("=== Cliente ===");
        cliente.exibirInformacoes();
        System.out.println("\n=== Fornecedor ===");
        fornecedor.exibirInformacoes();
        System.out.println("\n=== Empregado ===");
        empregado.exibirInformacoes();
        System.out.println("\n=== Vendedor ===");
        vendedor.exibirInformacoes();
        System.out.println("\n=== Usuário do Sistema ===");
        usuario.exibirInformacoes();
    }
}