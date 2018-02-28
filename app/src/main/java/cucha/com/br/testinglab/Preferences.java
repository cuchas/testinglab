package cucha.com.br.testinglab;

import java.util.List;

public interface Preferences {
    String getFilmes();
    void saveFilmes(List<Filme> filmeList);
}
