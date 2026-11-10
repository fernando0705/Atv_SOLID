public class NotificacaoWhatsapp implements Notificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Whatsapp" + mensagem);
    }
}
