package com.example.ordenamiento;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    Button btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
    Button btnFondo, btnRei, btnAyuda;
    ConstraintLayout cl;
    TextView tvFondo;
    MediaPlayer mpPerder, mpGanar;

    ArrayList<Integer> lista;
    ArrayList<Integer> apretados = new ArrayList<>();
    Random r = new Random();
    boolean flag = false;
    int fondo = 0;
    int numAle = r.nextInt(20);
    int intentos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cl = findViewById(R.id.cl);
        tvFondo = findViewById(R.id.tvFondo);
        btnFondo = findViewById(R.id.btnFondo);
        btnRei = findViewById(R.id.btnRei);
        btnAyuda = findViewById(R.id.btnAyuda);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);

        mpPerder = MediaPlayer.create(this, R.raw.error);
        mpGanar = MediaPlayer.create(this, R.raw.ganar);
        
        btnAyuda.setVisibility(View.INVISIBLE);

        lista = getIntent().getIntegerArrayListExtra(getResources().getString(R.string.lista));
        asignarTexto();

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btnFondo.setOnClickListener(this);
        btnRei.setOnClickListener(this);
        btnAyuda.setOnClickListener(this);
        prueba();
    }

    private void asignarTexto() {
        btn1.setText(String.valueOf(lista.get(0)));
        btn2.setText(String.valueOf(lista.get(1)));
        btn3.setText(String.valueOf(lista.get(2)));
        btn4.setText(String.valueOf(lista.get(3)));
        btn5.setText(String.valueOf(lista.get(4)));
        btn6.setText(String.valueOf(lista.get(5)));
        btn7.setText(String.valueOf(lista.get(6)));
        btn8.setText(String.valueOf(lista.get(7)));
        btn9.setText(String.valueOf(lista.get(8)));
        btn10.setText(String.valueOf(lista.get(9)));
        btn11.setText(String.valueOf(lista.get(10)));
        btn12.setText(String.valueOf(lista.get(11)));
        btn13.setText(String.valueOf(lista.get(12)));
        btn14.setText(String.valueOf(lista.get(13)));
        btn15.setText(String.valueOf(lista.get(14)));
        btn16.setText(String.valueOf(lista.get(15)));
        btn17.setText(String.valueOf(lista.get(16)));
        btn18.setText(String.valueOf(lista.get(17)));
        btn19.setText(String.valueOf(lista.get(18)));
        btn20.setText(String.valueOf(lista.get(19)));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                if(juego(0)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn2:
                if(juego(1)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn3:
                if(juego(2)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn4:
                if(juego(3)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn5:
                if(juego(4)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn6:
                if(juego(5)) {
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn7:
                if(juego(6)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn8:
                if(juego(7)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn9:
                if(juego(8)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn10:
                if(juego(9)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn11:
                if(juego(10)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn12:
                if(juego(11)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn13:
                if(juego(12)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn14:
                if(juego(13)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn15:
                if(juego(14)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn16:
                if(juego(15)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn17:
                if(juego(16)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn18:
                if(juego(17)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn19:
                if(juego(18)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btn20:
                if(juego(19)){
                    cambiarFondo(intentos);
                }
                break;
            case R.id.btnFondo:
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra(getResources().getString(R.string.keyFondo),fondo);
                startActivity(intent);
                break;
            case R.id.btnRei:
                reiniciar();
                break;
            case R.id.btnAyuda:
                ayudar();
                break;
        }

    }

    private boolean juego(int numero){
        apretados.add(numero);
        invisivilidadBotones(numero+1);
        intentos++;
        if(numero == numAle){
            Toast.makeText(Main2Activity.this, R.string.ganador, Toast.LENGTH_SHORT).show();
            mpGanar.start();
            return true;
        }else{
            Toast.makeText(Main2Activity.this, R.string.incorrecto, Toast.LENGTH_SHORT).show();
            tvFondo.setText(String.format(getResources().getString(R.string.llevas),intentos));
            mpPerder.start();
            if(intentos == 5 || intentos == 10 || intentos == 11){
                btnAyuda.setVisibility(View.VISIBLE);
            }
        }
        return false;
    }

    private void reiniciar() {
        intentos = 0;
        numAle = r.nextInt(20);
        cambiarFondo(intentos);
        visibilidadBotones();
        prueba();
        tvFondo.setText(getResources().getString(R.string.encontar));
    }

    private void prueba() {
        Log.d(getResources().getString(R.string.tag), String.format(getResources().getString(R.string.logMes),numAle+1));
    }

    private void ayudar() {
        Random help = new Random();
        int ayuda;
        do{
            ayuda = help.nextInt(20);
            for(int i = 0; i < apretados.size(); i++){
                if(ayuda == apretados.get(i)){
                    ayuda = numAle;
                    i = apretados.size();
                }
            }
        }while(ayuda == numAle);
        intentos = intentos + 2;
        tvFondo.setText(String.format(getResources().getString(R.string.llevas),intentos));
        invisivilidadBotones(ayuda+1);
        apretados.add(ayuda);
        btnAyuda.setVisibility(View.INVISIBLE);
    }

    private void invisivilidadBotones(int boton){
        switch (boton){
            case 1:
                btn1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                btn2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                btn3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                btn4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                btn5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                btn6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                btn7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                btn8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                btn9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                btn10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                btn11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                btn12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                btn13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                btn14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                btn15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                btn16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                btn17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                btn18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                btn19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                btn20.setVisibility(View.INVISIBLE);
                break;
        }

    }

    private void visibilidadBotones() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
        btn5.setVisibility(View.VISIBLE);
        btn6.setVisibility(View.VISIBLE);
        btn7.setVisibility(View.VISIBLE);
        btn8.setVisibility(View.VISIBLE);
        btn9.setVisibility(View.VISIBLE);
        btn10.setVisibility(View.VISIBLE);
        btn11.setVisibility(View.VISIBLE);
        btn12.setVisibility(View.VISIBLE);
        btn13.setVisibility(View.VISIBLE);
        btn14.setVisibility(View.VISIBLE);
        btn15.setVisibility(View.VISIBLE);
        btn16.setVisibility(View.VISIBLE);
        btn17.setVisibility(View.VISIBLE);
        btn18.setVisibility(View.VISIBLE);
        btn19.setVisibility(View.VISIBLE);
        btn20.setVisibility(View.VISIBLE);

    }

    private void cambiarFondo(int intentos) {
        int fondo = cambiarFondoId(intentos);
        switch (fondo){
            case 0:
                cl.setBackground(getResources().getDrawable(R.drawable.quintillizas));
                break;
            case 1:
                cl.setBackground(getResources().getDrawable(R.drawable.evacero));
                break;
            case 2:
                cl.setBackground(getResources().getDrawable(R.drawable.eva));
                break;
            case 3:
                cl.setBackground(getResources().getDrawable(R.drawable.evados));
                break;
            case 4:
                cl.setBackground(getResources().getDrawable(R.drawable.evatres));
                break;
            case 5:
                cl.setBackground(getResources().getDrawable(R.drawable.evacinco));
                break;
            case 6:
                cl.setBackground(getResources().getDrawable(R.drawable.evaseis));
                break;
            case 7:
                cl.setBackground(getResources().getDrawable(R.drawable.baam));
                break;
            case 8:
                cl.setBackground(getResources().getDrawable(R.drawable.khun));
                break;
            case 9:
                cl.setBackground(getResources().getDrawable(R.drawable.maestro));
                break;
        }
    }

    private int cambiarFondoId(int intentos) {
        switch (intentos){
            case 0:
                return fondo = 0;
            case 1:
                return fondo = 1;
            case 2:
                return fondo = 2;
            case 3:
                return fondo = 3;
            case 4:
                return fondo = 4;
            case 5:
                return fondo = 5;
            case 6:
                return fondo = 6;
            default:
                if(intentos > 5 && intentos < 10){
                    return fondo = 7;
                }else if(intentos >= 10 && intentos < 15){
                    return fondo = 8;
                }else{
                    return fondo = 9;
                }
        }
    }
}
