package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText etNum;
    Button btn;
    TextView tvBienvenida;
    ImageButton imB;

    ArrayList<Integer> lista = new ArrayList<>();
    int elementos = 1;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imB = findViewById(R.id.imB);
        etNum = findViewById(R.id.etNum);
        btn = findViewById(R.id.btn);
        tvBienvenida = findViewById(R.id.bienvenida);

        int fondo = getIntent().getIntExtra(getResources().getString(R.string.keyFondo),0);

        imB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llenarArreglo();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero();
                if(flag){
                    enviar();
                }else {
                    if (lista.size() == 19) {
                        btn.setText(R.string.enviar);
                        flag = true;
                    }
                }
            }
        });
    }

    private void enviar() {
        ordenar();
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra(getResources().getString(R.string.lista), lista);
        startActivity(intent);
        lista.clear();
    }

    private void llenarArreglo() {
        Random r = new Random();
        do{
            int numAle = r.nextInt(1000);
            lista.add(numAle);
        }while(lista.size() < 20);
        enviar();
    }

    private void ordenar() {
        boolean cambio;
        int actual = 0, direccion = 1;
        int comienzo = 1, fin = 19;
        int temp;
        do {
            cambio = false;
            while (((direccion==1) && (actual < fin))  || ((direccion==-1) && (actual>comienzo))){
                actual += direccion;
                if (lista.get(actual) < lista.get(actual-1)){
                    temp = lista.get(actual);
                    lista.set(actual, lista.get(actual-1));
                    lista.set(actual-1,temp);
                    cambio = true;
                }
            }
            if(direccion == 1){
                fin--;
            }
            else{
                comienzo++;
            }
            direccion = -direccion;
        }while (cambio);
    }

    private void agregarNumero() {
        String numero = etNum.getText().toString();
        if(comprobarNumero(numero)){
            lista.add(Integer.parseInt(numero));
            borrarContenido();
        }
        tvBienvenida.setText(String.format(getResources().getString(R.string.ingresado),elementos));
        elementos++;
    }

    private void borrarContenido() {
        etNum.setText(getResources().getString(R.string.vacio));
    }

    private boolean comprobarNumero(String numero) {
        if(numero.length() == 0){
            etNum.setError(getResources().getString(R.string.error));
            return false;
        }
        return true;
    }
}
