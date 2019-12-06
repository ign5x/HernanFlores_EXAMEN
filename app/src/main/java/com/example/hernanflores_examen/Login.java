package com.example.hernanflores_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    Button btnLogin;
EditText txtuser,txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtuser=findViewById(R.id.txtUser);
        txtPassword=findViewById(R.id.txtPassword);
        btnLogin=findViewById(R.id.btnLogin);


    }

    public  void Ingresar(View v)
    {
        if (txtuser.getText().toString().equals("estudiante2019") && txtPassword.getText().toString().equals("uisrael2019"))
        {
            Toast.makeText(getApplicationContext(),"Redirigiendo...", Toast.LENGTH_SHORT).show();
            Intent abrir= new Intent (Login.this, Registro.class);
            abrir.putExtra("valor enviado login", txtuser.getText().toString());
            startActivity(abrir);
        }
        else
        {
            Toast.makeText(getApplication(), "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}
