
public class Main {
    public static void main(String[] args) {
            GerenciarPedidos gerenciar = new GerenciarPedidos();

            Pedido pedido1 = gerenciar.criarPedido("Pedido de exemplo 1", 49.90);
            Pedido pedido2 = gerenciar.criarPedido("Pedido de exemplo 2", 99.50);

            gerenciar.salvarPedido(pedido1);
            gerenciar.salvarPedido(pedido2);

            System.out.println("Exibindo primeiro pedido:");
            gerenciar.exibirInformacoesPedido(pedido1);

            System.out.println("\nListando todos os pedidos:");
            gerenciar.listarTodosPedidos();
    }
}