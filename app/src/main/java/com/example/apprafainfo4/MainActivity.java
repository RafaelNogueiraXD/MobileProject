package com.example.apprafainfo4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edit;
    private TextView text;
    private Button button;
    private TextView phoneView;
    private  EditText phoneEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.nomeEdit);
        text = (TextView) findViewById(R.id.nomeInput);
        phoneView = (TextView) findViewById(R.id.phonePrint);
        phoneEdit = (EditText) findViewById(R.id.phoneEdit);
        Button button = (Button) findViewById(R.id.enviar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                text.setText(s);
                String f = phoneEdit.getText().toString();
                phoneView.setText(f);
            }
        });
    }
}
