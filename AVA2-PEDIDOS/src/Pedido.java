import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private String dataHora;
    private String status; // Exemplo: "Processando", "Enviado", "Entregue", "Cancelado"
    private Cliente cliente;
    private Vendedor vendedor;
    private List<ItemPedido> itens;
    private double valorTotal;

    public Pedido(int id, String dataHora, Cliente cliente, Vendedor vendedor) {
        this.id = id;
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = new ArrayList<>();
        this.status = "Processando"; // Status inicial
    }

    public void calcularValorTotal() {
        this.valorTotal = itens.stream()
                .mapToDouble(item -> item.getQuantidade() * item.getPrecoUnitario())
                .sum();
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        calcularValorTotal();
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
        calcularValorTotal();
    }

    public void aplicarDesconto(double percentual) {
        valorTotal *= (1 - percentual / 100);
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}