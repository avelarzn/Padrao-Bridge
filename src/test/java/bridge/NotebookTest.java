package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {

    @Test
    void deveRetornarNotebookComFreteRio() {
        Produto produto = new RioDeJaneiro();
        Notebook notebook = new Notebook(50.0f);
        notebook.setProduto(produto);
        notebook.setNumFronteiras(2);
        assertEquals(120.00001f, notebook.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarNotebookComFreteSaoPaulo() {
        Produto produto = new SaoPaulo();
        Notebook notebook = new Notebook(50.0f);
        notebook.setProduto(produto);
        notebook.setNumFronteiras(2);
        assertEquals(110.0f, notebook.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarNotebookComFreteMinasGerais() {
        Produto produto = new MinasGerais();
        Notebook notebook = new Notebook(50.0f);
        notebook.setProduto(produto);
        notebook.setNumFronteiras(2);
        assertEquals(100.0f, notebook.calcularPreco(), 0.01f);
    }
}