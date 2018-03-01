package cucha.com.br.testinglab;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Locale;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class FilmeTest {

    private Filme filme;

    @Before
    public void setUp() {
        filme = new Filme();
    }

    @Test
    public void when_getPrecoFormatado_should_formatEmReais() {
    }
}
