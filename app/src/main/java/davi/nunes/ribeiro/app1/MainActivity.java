package davi.nunes.ribeiro.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); //busca o botão na tela pelo id

        btnEnviar.setOnClickListener(new View.OnClickListener() { //adiciona evento quando o botão é clicado
            @Override
            public void onClick(View view) { //método que roda quando o botão é ativado
                Intent i = new Intent(MainActivity.this, NextActivity.class); //cria nova intent, que passa a intenção de navegar de um lugar pra outro, no caso, de uma tela (activity) para outra.
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //busca o edit text pelo id
                String textoDigitado = etDigiteAqui.getText().toString(); //pega o texto do edit text e converte pra string
                i.putExtra("texto", textoDigitado); //cria no dicionário do intent uma chave "texto" e associa com o texto digitado
                startActivity(i); //muda para a tela indicada na criação da intent
            }
        });

    }
}