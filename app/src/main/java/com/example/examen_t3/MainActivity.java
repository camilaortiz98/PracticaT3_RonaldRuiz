package com.example.examen_t3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button boton1 = findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("MAIN_APP", "Click en el bton1");

                Intent intent = new Intent(getApplicationContext(), Pokemons.class);
                startActivity(intent);
            }
        });

        Button boton2 = findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN_APP", "Click en el bton2");

                Intent intent = new Intent(getApplicationContext(), ingresarPokemon.class);
                startActivity(intent);
            }
        });

    }
}