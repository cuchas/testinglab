package cucha.com.br.testinglab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ViewFlipper;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements FilmesAdapter.Listener {

    private static final int FILMES = 0;
    private static final int EMPTY = 1;
    private RecyclerView recycler;
    private FilmesAdapter adapter;
    private FilmesAPI api;
    private ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new FilmesAdapter(Locale.getDefault(), this);
        api = AppModule.getFilmesAPI();

        flipper = findViewById(R.id.viewFlipper);

        recycler = findViewById(R.id.recyclerView);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    public void mostraFilmes(List<Filme> filmeList) {
        adapter.appendFilmes(filmeList);

        flipper.setDisplayedChild(FILMES);
    }

    public void mostraVazio() {
        flipper.setDisplayedChild(EMPTY);
    }

    @Override
    public void onItemClick(Filme filme) {
        mostraDetalhesFilme(filme);
    }

    public void mostraDetalhesFilme(Filme filme) {
        DetailsActivity.startActivity(getApplicationContext(), filme);
    }

    public void mostraServidorFora() {
        ServerToBusyActivity.startActivity(this);
    }

    public void mostraTimeout() {
        TimeoutActivity.startActivity(this);
    }
}
