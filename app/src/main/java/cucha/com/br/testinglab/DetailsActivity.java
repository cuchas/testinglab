package cucha.com.br.testinglab;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private static String EXTRA_FILME = "EXTRA_FILME";
    private ImageView image;
    private TextView textTitulo;
    private TextView textPreco;
    private Button button;
    private Filme filme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        filme = (Filme) getIntent().getSerializableExtra(EXTRA_FILME);

        image = findViewById(R.id.imageView);
        textTitulo = findViewById(R.id.textViewTitulo);
        textPreco = findViewById(R.id.textViewPreco);
        button = findViewById(R.id.buttonComprar);
    }

    public static void startActivity(Context context, Filme filme) {
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(EXTRA_FILME, filme);
        context.startActivity(intent);
    }
}
