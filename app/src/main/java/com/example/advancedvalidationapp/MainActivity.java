package com.example.advancedvalidationapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.advancedvalidationapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.wyslij).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = ((EditText)findViewById(R.id.form1)).getText().toString().trim();
                String email = ((EditText)findViewById(R.id.form2)).getText().toString().trim();
                String surname = ((EditText)findViewById(R.id.form3)).getText().toString().trim();
                String phone = ((EditText)findViewById(R.id.form4)).getText().toString().trim();
                String pass = ((EditText)findViewById(R.id.form5)).getText().toString().trim();
                String passConf = ((EditText)findViewById(R.id.form6)).getText().toString().trim();
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać imię",Toast.LENGTH_SHORT).show();
                }
                else if(surname.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać nazwisko",Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać email",Toast.LENGTH_SHORT).show();
                }

                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this, "Niepoprawny adres email",Toast.LENGTH_SHORT).show();
                }
                else if(phone.isEmpty()){
                    Toast.makeText(MainActivity.this, "Podaj numer telefonu",Toast.LENGTH_SHORT).show();
                }
                else if(phone.length()<9){
                    Toast.makeText(MainActivity.this, "Numer telefonu musi mieć co najmniej 9 znaków",Toast.LENGTH_SHORT).show();
                }
                else if(pass.isEmpty()){
                    Toast.makeText(MainActivity.this, "Podaj hasło",Toast.LENGTH_SHORT).show();
                }
                else if(pass.length()<6){
                    Toast.makeText(MainActivity.this, "Hasło musi mieć co najmniej 6 znaków",Toast.LENGTH_SHORT).show();
                }
                else if(passConf.isEmpty()){
                    Toast.makeText(MainActivity.this, "Powtórz hasło",Toast.LENGTH_SHORT).show();
                }
                else if(!pass.equals(passConf)){
                    Toast.makeText(MainActivity.this, "Hasła się róźnią",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}