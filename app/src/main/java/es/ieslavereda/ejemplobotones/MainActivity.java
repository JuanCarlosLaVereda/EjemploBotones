package es.ieslavereda.ejemplobotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView contadorVista;
    private Button incrementaBoton;
    private Button decrementaBoton;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorVista = findViewById(R.id.contadorView);
        incrementaBoton = findViewById(R.id.incrementa);
        decrementaBoton = findViewById(R.id.decrementa);
        contador = 0;

        incrementaBoton.setOnClickListener(view -> {
            if (contadorVista!=null){
                contadorVista.setText(Integer.toString(++contador));
            }
        });

        decrementaBoton.setOnClickListener(view -> {
            if (contadorVista!=null && !contadorVista.getText().equals("") && Integer.valueOf(contadorVista.getText().toString())>0){
                contadorVista.setText(Integer.toString(--contador));
            }
        });
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "ESTO ES UNA PRUEBA, UN EJEMPLO",
                Toast.LENGTH_SHORT);
        toast.show();
    }

}