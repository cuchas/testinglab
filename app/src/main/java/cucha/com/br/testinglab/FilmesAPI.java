package cucha.com.br.testinglab;


import java.util.List;

import rx.Observable;

public interface FilmesAPI {
    Observable<List<Filme>> getFilmes();
}
