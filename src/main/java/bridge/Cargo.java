package bridge;

public abstract class Cargo {

    protected Produto produto;

    protected float precoFrete;

    public Cargo(float precoFrete) {
        this.precoFrete = precoFrete;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setPrecoFrete(float precoFrete) {
        this.precoFrete = precoFrete;
    }

    public abstract float calcularPreco();
}
