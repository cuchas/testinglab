package cucha.com.br.testinglab;

import java.io.Serializable;

public class Filme implements Serializable {
    private String url;
    private String titulo;
    private float preco;

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPreco() {
        return preco;
    }
}
