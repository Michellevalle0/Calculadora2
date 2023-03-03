package  com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double numero1 ;
    double numero2 ;
    double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.btnSumar)).setOnClickListener(this);
        (findViewById(R.id.btnRestar)).setOnClickListener(this);
        (findViewById(R.id.btnDividir)).setOnClickListener(this);
        (findViewById(R.id.btnMultiplicar)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnSumar:
                 numero1 = Double.valueOf (((TextView)findViewById(R.id.txtprimervalor)).getText().toString());
                 numero2 = Double.valueOf (((TextView)findViewById(R.id.txtsegundorvalor)).getText().toString());
                 resultado = numero1 + numero2;

                Toast.makeText(getApplicationContext(),String.valueOf(resultado),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnRestar:
                 numero1 = Double.valueOf (((TextView)findViewById(R.id.txtprimervalor)).getText().toString());
                 numero2 = Double.valueOf (((TextView)findViewById(R.id.txtsegundorvalor)).getText().toString());
                 resultado = numero1 - numero2;

                Toast.makeText(getApplicationContext(),String.valueOf(resultado),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnDividir:
                numero1 = Double.valueOf (((TextView)findViewById(R.id.txtprimervalor)).getText().toString());
                numero2 = Double.valueOf (((TextView)findViewById(R.id.txtsegundorvalor)).getText().toString());
                resultado = numero1 / numero2;

                Toast.makeText(getApplicationContext(),String.valueOf(resultado),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnMultiplicar:
                numero1 = Double.valueOf (((TextView)findViewById(R.id.txtprimervalor)).getText().toString());
                numero2 = Double.valueOf (((TextView)findViewById(R.id.txtsegundorvalor)).getText().toString());
                resultado = numero1 * numero2;

                Toast.makeText(getApplicationContext(),String.valueOf(resultado),Toast.LENGTH_LONG).show();
                break;
        }


    }
}