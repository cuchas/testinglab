package cucha.com.br.testinglab;

import android.support.annotation.NonNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.fail;

@RunWith(JUnit4.class)
public class MainPresenterTest {

    @Before
    public void setUp() {
        fail();
    }

    @Test
    public void when_listFilmes_should_mostrarFilmes() {
        fail();
    }

    @NonNull
    private List<Filme> getFilmeList() {
        List<Filme> filmeList = new ArrayList<>(2);
        filmeList.add(new Filme());
        filmeList.add(new Filme());
        return filmeList;
    }

    @Test
    public void when_listFilmes_should_getFromCache() {
        fail();
    }

    @Test
    public void when_listFilmes_should_saveCache() {
        fail();
    }

    @Test
    public void when_listFilmesAndBodyEmpty_should_mostrarVazio() {
        fail();
    }

    @Test
    public void when_listFilmesAndServerError_should_mostrarServidorFora() {
        fail();
    }

    @Test
    public void when_filmeSelecionado_should_mostrarDetalhes() {
        fail();
    }
}
