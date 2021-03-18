package com.example.cambiomoneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt_entrada;
    TextView txt_resultado;
    RadioButton btn_dolar;
    RadioButton btn_euro;
    RadioButton btn_franco;
    RadioButton btn_esterlina;
    RadioButton btn_yen;
    RadioButton btn_hongkon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_entrada = findViewById(R.id.entrada);
        txt_resultado = findViewById(R.id.resultado);
        btn_dolar = findViewById(R.id.rd_USD);
        btn_dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_dolar.isChecked()){
                    double dolar = Integer.parseInt(txt_entrada.getText().toString());
                    double peso = 58.50;
                    txt_resultado.setText(String.valueOf(dolar * peso));
                }
            }
        });

        btn_euro = findViewById(R.id.rb_EUR);
        btn_euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_euro.isChecked()){
                    double euro = Integer.parseInt(txt_entrada.getText().toString());
                    double peso = 68.59;
                    txt_resultado.setText(String.valueOf(euro * peso));
                }
            }
        });

        btn_esterlina = findViewById(R.id.rb_GBR);
        btn_esterlina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_esterlina.isChecked()){
                    double esterlina = Integer.parseInt(txt_entrada.getText().toString());
                    double peso = 80.78;
                    txt_resultado.setText(String.valueOf(esterlina * peso));
                }
            }
        });

        btn_franco = findViewById(R.id.rd_CHF);
        btn_franco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_franco.isChecked()){
                    double franco = Integer.parseInt(txt_entrada.getText().toString());
                    double peso = 62.02;
                    txt_resultado.setText(String.valueOf(franco * peso));
                }
            }
        });

        btn_yen = findViewById(R.id.rb_JPY);
        btn_yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_yen.isChecked()){
                    double yen = Integer.parseInt(txt_entrada.getText().toString());
                    double peso = 0.53;
                    txt_resultado.setText(String.valueOf(yen * peso));
                }
            }
        });

        btn_hongkon = findViewById(R.id.rb_HKD);
        btn_hongkon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_hongkon.isChecked()){
                    double hongkon = Integer.parseInt(txt_entrada.getText().toString());
                    double peso = 7.42;
                    txt_resultado.setText(String.valueOf(hongkon * peso));
                }
            }
        });
    }
}