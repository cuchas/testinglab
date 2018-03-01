package cucha.com.br.testinglab;

import java.util.List;
import retrofit2.http.GET;
import rx.Observable;

public interface FilmesAPI {
    @GET("/filmes")
    Observable<List<Filme>> getFilmes();
}
