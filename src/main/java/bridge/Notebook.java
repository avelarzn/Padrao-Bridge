package bridge;

public class Notebook extends Cargo{
    private int numFronteiras;

    public Notebook(float precoFrete) {
        super(precoFrete);
    }

    public void setNumFronteiras(int numFronteiras) {
        this.numFronteiras = numFronteiras;
    }

    public float calcularPreco() {
        return this.precoFrete * this.numFronteiras * (1 + this.produto.percentualAumento());
    }
}
