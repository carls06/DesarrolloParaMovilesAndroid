package com.ejemploudb.guia4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nom,iss,sal,afp,renta,hora,pago;
    String nombre;
    int horas;
    Double temp,istem,rentem,aftptem,pagotem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        Bundle data = getIntent().getExtras();

        nom=findViewById(R.id.nombre);
        iss=findViewById(R.id.isss);
        sal=findViewById(R.id.sal);
        hora=findViewById(R.id.horas);
        afp=findViewById(R.id.afp);
        renta=findViewById(R.id.renta);
        pago=findViewById(R.id.pago);

        nombre=data.getString("name","");
        horas=data.getInt("horas",0);


        temp=horas*8.50;

        nom.setText("Nombre:"+nombre);
        hora.setText("Horas Trabajadas "+horas);
        sal.setText("Salario:  $"+Double.valueOf(temp).toString());

        /*ISSS 2%, AFP 3%, RENTA 4%,*/

        istem=temp*0.02;
        iss.setText("ISSS: $"+Double.valueOf(istem).toString());
        aftptem=temp*0.03;
        afp.setText("AFP: $"+Double.valueOf(aftptem).toString());
        rentem=temp*0.04;
        renta.setText("RENTA: $"+Double.valueOf(rentem).toString());

        pagotem=temp-(istem+aftptem+rentem);
        pago.setText("Salario Neto: $"+Double.valueOf(pagotem).toString());







    }


}