package com.ejemploudb.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Integer> numeros;
    private  int cont3=0, cont5=0;
    private ArrayAdapter<Integer> adaptador1;
    private ListView lv1;
    private EditText et1;
    private TextView contador;
    private TextView contador2;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numeros = new ArrayList<Integer>();


        adaptador1 = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,numeros);
        lv1=(ListView)findViewById(R.id.listView);
        lv1.setAdapter(adaptador1);
        et1=(EditText)findViewById(R.id.editText);
        contador=(TextView)findViewById(R.id.cont3);
        contador2=(TextView)findViewById(R.id.cont5);
        contador.setText("" + cont3);
        contador2.setText("" + cont5);






    }

    public void  agregar(View v){

        int numentero = Integer.parseInt(et1.getText().toString());
        numeros.add( numentero);
        adaptador1.notifyDataSetChanged();
        et1.setText("");
        calcular();


    }


    public void calcular() {
        cont3=0;
        cont5=0;

        if (numeros.isEmpty() == true) {
            return;
        } else {

            for (int f = 1; f < numeros.size(); f++) {

                if (numeros.get(f) % 3 == 0) {
                    cont3++;
                    contador.setText("" + cont3);

                } else if (numeros.get(f) % 5 == 0) {
                    cont5++;
                    contador2.setText("" + cont5);
                }
            }
        }
    }


    }

