interface IGerenciadorEntrega {
    public void gerenciadorEntrega();
}
public class Entregas implements IGerenciadorEntrega {
    @Override
    public void gerenciadorEntrega() {
        System.out.println("Pedido saiu para entrega!");
    }
}
