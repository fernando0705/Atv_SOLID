class PedidoRepository {
    public void salvar(Pedido pedido) {
        System.out.println("Salvando no banco: " + pedido.getDescricao());
    }
}