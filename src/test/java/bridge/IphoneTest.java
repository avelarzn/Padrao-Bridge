package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IphoneTest {
    @Test
    void deveRetornarIphoneComFreteNoRio() {
        Produto produto = new RioDeJaneiro();
        Iphone iphone = new Iphone(2000.0f);
        iphone.setProduto(produto);
        assertEquals(2400.0f, iphone.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarIphoneComFreteEmSaoPaulo() {
        Produto produto = new SaoPaulo();
        Iphone iphone = new Iphone(2000.0f);
        iphone.setProduto(produto);
        assertEquals(2200.0f, iphone.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarIphoneComFreteEmMinasGerais() {
        Produto produto = new MinasGerais();
        Iphone iphone = new Iphone(2000.0f);
        iphone.setProduto(produto);
        assertEquals(2000.0f, iphone.calcularPreco(), 0.01f);
    }
}