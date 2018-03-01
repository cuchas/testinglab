package cucha.com.br.testinglab;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import br.com.concretesolutions.requestmatcher.LocalTestRequestMatcherRule;
import br.com.concretesolutions.requestmatcher.RequestMatcherRule;
import br.com.concretesolutions.requestmatcher.model.HttpMethod;
import rx.schedulers.Schedulers;

@RunWith(JUnit4.class)
public class FilmeApiTest {
    @Rule
    public final RequestMatcherRule server = new LocalTestRequestMatcherRule();
    private FilmesAPI api;

    @Before
    public void setUp() {
        String url = server.url("/").toString();
        AppModule.setBaseUrl(url);

        api = AppModule.getFilmesAPI();
    }

    @Test
    public void when_getFilmes_should_callSlashFilmes() {
    }
}
