import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamentoPedidos {
    private List<Pedido> pedidos;

    public SistemaGerenciamentoPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void criarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public List<Pedido> filtrarPedidosPorStatus(String status) {
        List<Pedido> filtrados = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getStatus().equalsIgnoreCase(status)) {
                filtrados.add(pedido);
            }
        }
        return filtrados;
    }
}