package com.ejemploudb.guia4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtname,edthoras;
    int horas;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        edtname=findViewById(R.id.edtNombre);
        edthoras=findViewById(R.id.edtHoras);


    }

    public void Send(View view) {

        horas = Integer.valueOf(edthoras.getText().toString());
        nombre=edtname.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("name",nombre );
        intent.putExtra("horas",horas);
        startActivityForResult(intent,10);


    }
}