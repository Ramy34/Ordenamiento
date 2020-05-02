package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText etNum;
    Button btn;
    ArrayList<Integer> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum = findViewById(R.id.etNum);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero();
                if(lista.size() == 19){
                    btn.setText(R.string.enviar);
                }else if(lista.size() == 20){
                    ordenar();
                    prueba();
                }
            }
        });
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

    private void prueba() {
        for(int i = 0; i < lista.size(); i++){
            Log.d("PRUEBA","El elemento en la posición " + i + " es: " + lista.get(i));
        }
    }

    private void agregarNumero() {
        String numero = etNum.getText().toString();
        if(comprobarNumero(numero)){
            lista.add(Integer.parseInt(numero));
            borrarContenido();
        }
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
