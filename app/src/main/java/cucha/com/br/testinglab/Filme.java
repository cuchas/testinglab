package cucha.com.br.testinglab;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class Filme implements Serializable {
    private Locale locale;
    private String url;
    private String titulo;
    private float preco;

    public Filme() {}

    public Filme(Locale locale) {
        this.locale = locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

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

    public String getPrecoFormatado() {
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(preco);
    }
}
