package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView txt;
    Button btn;
    EditText text;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView=findViewById(R.id.textview);
        btn = findViewById(R.id.btn);
        text = findViewById(R.id.text);
        txt = findViewById(R.id.displaytext);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = text.getText().toString();
//                Toast.makeText(MainActivity.this,"HELLO  "+name,Toast.LENGTH_LONG).show();
                txt.setText("HELLO  "+name);
            }
        });


    }
}