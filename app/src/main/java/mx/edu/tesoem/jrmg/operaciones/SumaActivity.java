package mx.edu.tesoem.jrmg.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {

    EditText r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        r1 = (EditText) findViewById(R.id.r1);
        r2 = (EditText) findViewById(R.id.r2);
        Button btnsuma = (Button) findViewById(R.id.button2);
        final TextView tvResultado = (TextView) findViewById(R.id.textView12);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.valueOf(r1.getText().toString());
                int a2 = Integer.valueOf(r2.getText().toString());
                int resultado = a1 + a2;
                tvResultado.setText(""+ resultado);
            }
        });
    }
}
