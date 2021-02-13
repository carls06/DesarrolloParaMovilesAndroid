package com.example.guia_3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;


public class MainActivity extends AppCompatActivity {

      private   TextView txt;
       private Button boton;
        private int num=0;
        public static final String SHARED_PREF="CUALQUIER COSA";
        public static  final  String COUNTER_KEY="COUNTER";
        SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new MyLifeCycleObserver());
        setContentView(R.layout.activity_main);

        shared=getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);

        txt=(TextView)findViewById(R.id.txtnum);
        boton =(Button)findViewById(R.id.button);

        txt.setText(Integer.toString(num));



    }

    public void guardarDatos()
    {
        num = Integer.parseInt(txt.toString());
    }

    public void masuno(View v)
    {

        if(num<=8)
        {
            num++;

        }
        else {
                num=0;
            }
        txt.setText(Integer.toString(num));


    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("CONTI", num);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        num = savedInstanceState.getInt("CONTI");
        txt.setText(String.valueOf(num));
    }







}