
package mx.edu.tesoem.jrmg.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    TextView b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        b1 = (TextView)  findViewById(R.id.textView6);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     String opt = null;

        switch (opt) {

            case "Suma":
                Intent sum = new Intent(this,SumaActivity.class);
                startActivity(sum);
                finish();
                break;

            case  "Resta":
                Intent res = new Intent(this,RestaActivity.class);
                startActivity(res);
                finish();
                break;

            case "Multiplicación":
                Intent mul = new Intent(this,MultiActivity.class);
                startActivity(mul);
                finish();
                break;

            case "Division":
                Intent div = new Intent(this, DivActivity.class);
                startActivity(div);
                finish();
                break;
        }
        }
    }

