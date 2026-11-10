public class PagamentoCartao implements FormaPagamento {
    public void pagar(double valor) {
        System.out.println("Pago com Cartão: R$" + valor);
    }
}
