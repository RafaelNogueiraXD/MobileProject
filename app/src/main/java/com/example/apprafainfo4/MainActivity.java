package com.example.apprafainfo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edit;
    private Button button;
    private String mostra = "teste";
    private Editable varS;
    private  EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.nomeEdit);
        senha = (EditText) findViewById(R.id.phoneEdit);
        Button button = (Button) findViewById(R.id.enviar);
//        Toast toast = Toast.makeText(context, text, duration);
       button.setOnClickListener(this);


    }
    @Override
    public  void onClick(View view){
        Editable nome = edit.getText();
        Editable passwords = senha.getText();
        if(String.valueOf(nome) == "Rafael" && String.valueOf(passwords) == "123"){
            Bundle b  = new Bundle();
            Intent janela = new Intent(this,Activity2.class);
            varS = edit.getText();
            b.putString("nome", String.valueOf(varS));
            janela.putExtras(b);
            startActivity(janela);
        }else{
            Toast mensagem = Toast.makeText(this,mostra,Toast.LENGTH_SHORT);
            mensagem.show();
        }


    }
}
