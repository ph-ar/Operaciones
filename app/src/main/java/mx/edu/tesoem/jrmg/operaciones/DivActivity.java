package mx.edu.tesoem.jrmg.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DivActivity extends AppCompatActivity {

    EditText div1,div2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);


        div1 = (EditText) findViewById(R.id.div1);
        div2 = (EditText) findViewById(R.id.div2);
        Button btnres = (Button) findViewById(R.id.button4);
        final TextView Resultado = (TextView) findViewById(R.id.textView14);

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a1 = Integer.valueOf(div1.getText().toString());
                int a2 = Integer.valueOf(div2.getText().toString());
                int resultado = a1 / a2;
                Resultado.setText(""+ resultado);
            }
        });
    }
}
