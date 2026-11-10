public abstract class Produto {
    protected String nome;
    public Produto(String nome) { this.nome = nome; }
    public abstract void preparar();
}