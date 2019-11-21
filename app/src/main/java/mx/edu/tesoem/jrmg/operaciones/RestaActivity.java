package mx.edu.tesoem.jrmg.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {

    EditText res1,res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        res1 = (EditText) findViewById(R.id.res1);
        res2 = (EditText) findViewById(R.id.res2);
        Button btnres = (Button) findViewById(R.id.button);
        final TextView Resultado = (TextView) findViewById(R.id.textView11);

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.valueOf(res1.getText().toString());
                int a2 = Integer.valueOf(res2.getText().toString());
                int resultado = a1 - a2;
                Resultado.setText(""+ resultado);
            }
        });
    }
}
