package cucha.com.br.testinglab;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ServerToBusyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_to_busy);
    }

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, ServerToBusyActivity.class));
    }
}
