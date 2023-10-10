package bridge;

public class Iphone extends Cargo{
    public Iphone(float precoFrete) {
        super(precoFrete);
    }

    public float calcularPreco() {
        return this.precoFrete * (1 + this.produto.percentualAumento());
    }
}
