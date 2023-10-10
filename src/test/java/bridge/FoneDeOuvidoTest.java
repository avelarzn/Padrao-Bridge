package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoneDeOuvidoTest {

    @Test
    void deveRetornarFoneDeOuvidoComFreteNoRio() {
        Produto produto = new RioDeJaneiro();
        FoneDeOuvido foneDeOuvido = new FoneDeOuvido(1000.0f);
        foneDeOuvido.setProduto(produto);
        assertEquals(1000.0f, foneDeOuvido.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarFoneDeOuvidoComFreteEmSaoPaulo() {
        Produto produto = new SaoPaulo();
        FoneDeOuvido foneDeOuvido = new FoneDeOuvido(1000.0f);
        foneDeOuvido.setProduto(produto);
        assertEquals(1000.0f, foneDeOuvido.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarFoneDeOuvidoComFreteEmMinasGerais() {
        Produto produto = new MinasGerais();
        FoneDeOuvido foneDeOuvido = new FoneDeOuvido(1000.0f);
        foneDeOuvido.setProduto(produto);
        assertEquals(1000.0f, foneDeOuvido.calcularPreco(), 0.01f);
    }
}