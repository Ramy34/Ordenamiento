package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    Button btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
    ConstraintLayout cl;


    ArrayList<Integer> lista;

    Random r = new Random();
    int numAle = r.nextInt(20);
    int intentos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cl = findViewById(R.id.cl);
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
        prueba();
    }

    private boolean juego(int numero){
        if(numero == numAle){
            Toast.makeText(Main2Activity.this, R.string.ganador, Toast.LENGTH_SHORT).show();
            return true;
        }
        Toast.makeText(Main2Activity.this, R.string.incorrecto, Toast.LENGTH_SHORT).show();
        intentos++;
        return  false;
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

    private void prueba() {
        Log.d("PRUEBA","El número es: " + numAle);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                if(juego(0)){
                    cambiarFondo(intentos,v);
                }else{
                    btn1.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn2:
                if(juego(1)){
                    cambiarFondo(intentos,v);
                }else{
                    btn2.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn3:
                if(juego(2)){
                    cambiarFondo(intentos,v);
                }else{
                    btn3.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn4:
                if(juego(3)){
                    cambiarFondo(intentos,v);
                }else{
                    btn4.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn5:
                if(juego(4)){
                    cambiarFondo(intentos,v);
                }else{
                    btn5.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn6:
                if(juego(5)){
                    cambiarFondo(intentos,v);
                }else{
                    btn6.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn7:
                if(juego(6)){
                    cambiarFondo(intentos,v);
                }else{
                    btn7.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn8:
                if(juego(7)){
                    cambiarFondo(intentos,v);
                }else{
                    btn8.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn9:
                if(juego(8)){
                    cambiarFondo(intentos,v);
                }else{
                    btn9.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn10:
                if(juego(9)){
                    cambiarFondo(intentos,v);
                }else{
                    btn10.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn11:
                if(juego(10)){
                    cambiarFondo(intentos,v);
                }else{
                    btn11.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn12:
                if(juego(11)){
                    cambiarFondo(intentos,v);
                }else{
                    btn12.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn13:
                if(juego(12)){
                    cambiarFondo(intentos,v);
                }else{
                    btn13.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn14:
                if(juego(13)){
                    cambiarFondo(intentos,v);
                }else{
                    btn14.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn15:
                if(juego(14)){
                    cambiarFondo(intentos,v);
                }else{
                    btn15.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn16:
                if(juego(15)){
                    cambiarFondo(intentos,v);
                }else{
                    btn16.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn17:
                if(juego(16)){
                    cambiarFondo(intentos,v);
                }else{
                    btn17.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn18:
                if(juego(17)){
                    cambiarFondo(intentos,v);
                }else{
                    btn18.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn19:
                if(juego(18)){
                    cambiarFondo(intentos,v);
                }else{
                    btn19.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn20:
                if(juego(19)){
                    cambiarFondo(intentos,v);
                }else{
                    btn20.setVisibility(View.INVISIBLE);
                }
                break;
        }

    }

    private void cambiarFondo(int intentos, View v) {
        switch (intentos){
            case 0:
                cl.setBackground(getResources().getDrawable(R.drawable.evacero));
                break;
            case 1:
                cl.setBackground(getResources().getDrawable(R.drawable.eva));
                break;
            case 2:
                cl.setBackground(getResources().getDrawable(R.drawable.evados));
                break;
            case 3:
                cl.setBackground(getResources().getDrawable(R.drawable.evatres));
                break;
            case 4:
                cl.setBackground(getResources().getDrawable(R.drawable.evacinco));
                break;
            case 5:
                cl.setBackground(getResources().getDrawable(R.drawable.evaseis));
                break;
            default:
                if(intentos > 5 && intentos < 10){
                    cl.setBackground(getResources().getDrawable(R.drawable.baam));
                }else if(intentos >= 10 && intentos < 15){
                    cl.setBackground(getResources().getDrawable(R.drawable.khun));
                }else{
                    cl.setBackground(getResources().getDrawable(R.drawable.maestro));
                }
        }
    }
}
