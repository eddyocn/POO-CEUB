import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do cliente
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String cpfCliente = scanner.nextLine();

        System.out.println("Digite seu endereço completo:");
        String enderecoCliente = scanner.nextLine();

        System.out.println("Digite seu telefone:");
        String telefoneCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, enderecoCliente, telefoneCliente);

        // Solicitar dados do vendedor
        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Digite a matrícula do vendedor:");
        String matriculaVendedor = scanner.nextLine();

        Vendedor vendedor = new Vendedor(nomeVendedor, matriculaVendedor);

        // Criar o pedido
        Pedido pedido = new Pedido(1, "10/04/2025 14:00", cliente, vendedor);

        // Adicionar itens ao pedido
        String continuar;
        do {
            System.out.println("Digite o código do produto:");
            String codigoProduto = scanner.nextLine();

            System.out.println("Digite a descrição do produto:");
            String descricaoProduto = scanner.nextLine();

            System.out.println("Digite a quantidade desejada:");
            int quantidadeProduto = scanner.nextInt();

            System.out.println("Digite o preço unitário do produto:");
            double precoUnitarioProduto = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            ItemPedido item = new ItemPedido(codigoProduto, descricaoProduto, quantidadeProduto, precoUnitarioProduto);
            pedido.adicionarItem(item);

            System.out.println("Deseja adicionar mais itens? (sim/nao)");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("sim"));

        // Exibir resumo do pedido
        System.out.println("\nDetalhes do Pedido:");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Data e Hora: " + pedido.getDataHora());
        System.out.println("Cliente: " + cliente.getNomeCompleto());
        System.out.println("CPF do Cliente: " + cliente.getCpf());
        System.out.println("Endereço do Cliente: " + cliente.getEndereco());
        System.out.println("Telefone do Cliente: " + cliente.getTelefone());
        System.out.println("Vendedor: " + vendedor.getNomeCompleto());
        System.out.println("Matrícula do Vendedor: " + vendedor.getMatricula());
        System.out.println("Status do Pedido: " + pedido.getStatus());
        System.out.println("Valor Total do Pedido: R$ " + pedido.getValorTotal());

        System.out.println("\nItens do Pedido:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("Código do Produto: " + item.getCodigoProduto());
            System.out.println("Descrição do Produto: " + item.getDescricaoProduto());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Preço Unitário: R$ " + item.getPrecoUnitario());
            System.out.println();
        }

        scanner.close();
    }
}