package com.example.campo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText carga, campo, forca;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        campo = findViewById(R.id.CE);
        carga = findViewById(R.id.CARE);
        forca = findViewById(R.id.FE);
        res = findViewById(R.id.resultado);
    }
    public void encontrarcampo(View v){
        int cargaint = Integer.parseInt(carga.getText().toString());
        int forcaint = Integer.parseInt(forca.getText().toString());
        double campoele = forcaint/cargaint;
        String result = String.valueOf(campoele);
        res.setText(result);
    }
    public void encontrarforca(View v){
        int campoint = Integer.parseInt(campo.getText().toString());
        int cargaint = Integer.parseInt(carga.getText().toString());
        double forcaele = campoint/cargaint;
        String result = String.valueOf(forcaele);
        res.setText(result);
    }
    public void encontrarcarga(View v){
        int campoint = Integer.parseInt(campo.getText().toString());
        int forcaint = Integer.parseInt(forca.getText().toString());
        double cargaele = forcaint/campoint;
        String result = String.valueOf(cargaele);
        res.setText(result);
    }
}