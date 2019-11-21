package mx.edu.tesoem.jrmg.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiActivity extends AppCompatActivity {

    EditText mul1,mul2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);

        mul1 = (EditText) findViewById(R.id.mul1);
        mul2 = (EditText) findViewById(R.id.mul2);
        Button btnres = (Button) findViewById(R.id.button3);
        final TextView Resultado = (TextView) findViewById(R.id.textView13);

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.valueOf(mul1.getText().toString());
                int a2 = Integer.valueOf(mul2.getText().toString());
                int resultado = a1 * a2;
                Resultado.setText(""+ resultado);
            }
        });
    }
}
