package com.example.apprafainfo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends DebugActivity implements View.OnClickListener{
    private int cont = 0;

    private Button btn;
    private TextView printa;
    private TextView nomeUsu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btn = (Button) findViewById(R.id.btn2);
        printa = (TextView) findViewById(R.id.textVW);
        nomeUsu = (TextView) findViewById(R.id.respostaAtv);

        Bundle respostas = getIntent().getExtras();
        String nome = respostas.getString("nome");

        nomeUsu.setText(nome + " seja bem-vindo");

        btn.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn2){
            printa.setText(cont + "");
            cont++;
        }
    }
}

