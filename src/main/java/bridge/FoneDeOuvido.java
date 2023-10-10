package bridge;

public class FoneDeOuvido extends Cargo{
    public FoneDeOuvido(float precoFrete) {
        super(precoFrete);
    }

    public float calcularPreco() {
        return this.precoFrete;
    }
}
