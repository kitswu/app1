package davi.nunes.ribeiro.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent(); //recebe as informações da intent passada
        String textoDigitado = i.getStringExtra("texto"); //pega a chave "texto" criada na última activity
        TextView tvTexto = findViewById(R.id.tvTexto); //busca o textview pelo id
        tvTexto.setText(textoDigitado); //coloca o texto digitado no textview
    }
}