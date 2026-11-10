class SistemaDelivery {
    private Notificacao notificacao; // Depende da abstração, não da implementação concreta[cite: 2].

    public SistemaDelivery(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void notificarCliente(String mensagem) {
        notificacao.notificar(mensagem);
    }
}