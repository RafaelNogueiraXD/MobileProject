package com.example.apprafainfo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edit;
    private Button button;
    private TextView mostra;
    private Editable varS;
    private  EditText phoneEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.nomeEdit);
        mostra = (TextView) findViewById(R.id.mostraNome);
        phoneEdit = (EditText) findViewById(R.id.phoneEdit);
        Button button = (Button) findViewById(R.id.enviar);

       button.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view){
        Bundle b  = new Bundle();
        Intent janela = new Intent(this,Activity2.class);
        varS = edit.getText();
        b.putString("nome", String.valueOf(varS));
        janela.putExtras(b);
        startActivity(janela);
//        mostra.setText(edit.getText());
    }
}
