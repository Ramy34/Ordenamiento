package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    ConstraintLayout cl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        cl3 = findViewById(R.id.cl3);
        int fondo = getIntent().getIntExtra(getResources().getString(R.string.keyFondo),0);
        cambiarFondo(fondo);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    private void cambiarFondo(int fondo) {
        switch (fondo){
            case 0:
                cl3.setBackground(getResources().getDrawable(R.drawable.quintillizas));
                break;
            case 1:
                cl3.setBackground(getResources().getDrawable(R.drawable.evacero));
                break;
            case 2:
                cl3.setBackground(getResources().getDrawable(R.drawable.eva));
                break;
            case 3:
                cl3.setBackground(getResources().getDrawable(R.drawable.evados));
                break;
            case 4:
                cl3.setBackground(getResources().getDrawable(R.drawable.evatres));
                break;
            case 5:
                cl3.setBackground(getResources().getDrawable(R.drawable.evacinco));
                break;
            case 6:
                cl3.setBackground(getResources().getDrawable(R.drawable.evaseis));
                break;
            case 7:
                cl3.setBackground(getResources().getDrawable(R.drawable.baam));
                break;
            case 8:
                cl3.setBackground(getResources().getDrawable(R.drawable.khun));
                break;
            case 9:
                cl3.setBackground(getResources().getDrawable(R.drawable.maestro));
                break;
        }
    }
}
