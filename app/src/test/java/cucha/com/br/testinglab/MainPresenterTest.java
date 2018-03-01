package cucha.com.br.testinglab;

import android.support.annotation.NonNull;

import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import rx.Observable;
import rx.Scheduler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class MainPresenterTest {

    @Before
    public void setUp() {
    }

    @Test
    public void when_listFilmes_should_mostrarFilmes() {
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
    }

    @Test
    public void when_listFilmes_should_saveCache() {
    }

    @Test
    public void when_listFilmesAndBodyEmpty_should_mostrarVazio() {
    }

    @Test
    public void when_listFilmesAndServerError_should_mostrarServidorFora() {
    }

    @Test
    public void when_filmeSelecionado_should_mostrarDetalhes() {
    }
}
