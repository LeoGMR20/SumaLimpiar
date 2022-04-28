package com.example.proyecto28042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Atributos

    private EditText etNum1, etNum2;
    private CheckBox cbLimpiar;
    private Button btnSumar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        cbLimpiar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                limpiar(b);
            }
        });
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumar();
            }
        });
    }

    private void sumar() {
        if(etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()){
            Toast.makeText(this,"Debe ingresar todos los datos",Toast.LENGTH_LONG).show();
        }
        else{
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());
            int res = num1 + num2;
            tvResultado.setText("Resultado de la suma;"+res);
        }
    }
//lunes traer imagenes recordar inge
    private void limpiar(boolean b) {
        if(b){
            etNum1.setText("");
            etNum2.setText("");
        }
    }

    private void inicializarVistas() {
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        cbLimpiar = findViewById(R.id.cbLimpiar);
        btnSumar = findViewById(R.id.btnSumar);
        tvResultado = findViewById(R.id.tvResultado);
    }
}