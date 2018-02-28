package cucha.com.br.testinglab;


import io.reactivex.Observable;

public interface FilmesAPI {
    Observable<Filme> getFilmes();
}
