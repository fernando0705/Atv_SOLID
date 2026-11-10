class Hamburguer extends Produto {
    public Hamburguer() {
        super("Hamburguer");
    }

    public void preparar() {
        System.out.println("Fritando " + nome);
    }
}