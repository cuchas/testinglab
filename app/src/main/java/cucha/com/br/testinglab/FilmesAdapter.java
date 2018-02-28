package cucha.com.br.testinglab;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FilmesAdapter extends RecyclerView.Adapter<FilmesAdapter.FilmeViewHolder> {

    private final Locale locale;
    private final Listener listener;
    private List<Filme> filmeList = new ArrayList<>();

    interface Listener {
        void onItemClick(Filme filme);
    }

    public FilmesAdapter(Locale locale, Listener listener) {
        this.locale = locale;
        this.listener = listener;
    }

    @Override
    public FilmeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.view_filme, parent, false);
        return new FilmeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmeViewHolder holder, int position) {
        holder.bind(filmeList.get(position));
    }

    @Override
    public int getItemCount() {
        return filmeList.size();
    }

    public void appendFilmes(List<Filme> filmeList) {
        filmeList.addAll(filmeList);
        notifyDataSetChanged();
    }

    class FilmeViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView textTitulo;
        private final TextView textPreco;
        private final View container;

        FilmeViewHolder(View itemView) {
            super(itemView);

            container = itemView;
            image = itemView.findViewById(R.id.imageView);
            textTitulo = itemView.findViewById(R.id.textViewTitulo);
            textPreco = itemView.findViewById(R.id.textViewPreco);
        }

        void bind(final Filme filme) {
            Context context = image.getContext();
            Picasso.with(context)
                    .load(filme.getUrl())
                    .into(image);

            textTitulo.setText(filme.getTitulo());

            float preco = filme.getPreco();
            textPreco.setText(String.valueOf(preco));

            container.setOnClickListener(v -> listener.onItemClick(filme));
        }
    }
}
