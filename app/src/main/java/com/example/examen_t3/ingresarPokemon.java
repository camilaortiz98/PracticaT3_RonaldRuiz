package com.example.examen_t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.examen_t3.entities.Pokemon;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ingresarPokemon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_pokemon);

        Button botonRegistrar = findViewById(R.id.botonR);
        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtNombre = findViewById(R.id.idnombre);
                EditText txtTipo = findViewById(R.id.idTipo);
                EditText txtUrl = findViewById(R.id.idurl);
                EditText txtLt = findViewById(R.id.idLt);
                EditText txtLg = findViewById(R.id.idLg);
                String vNombre = String.valueOf(txtNombre.getText());
                String vTipo = String.valueOf(txtTipo.getText());
                String vUrl= String.valueOf(txtUrl.getText());
                String vLt= String.valueOf(txtLt.getText());
                String vLg= String.valueOf(txtLg.getText());


                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://628f68e4dc478523653ffd8a.mockapi.io/api/pokemon")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();


                PokemonService service = retrofit.create(PokemonService.class);
                Pokemon pokemon = new Pokemon();
                pokemon.setNombrePokemon(vNombre);
                pokemon.setTipoPokemon(vTipo);
                pokemon.setUrlPokemon(vUrl);
                pokemon.setPokemonLatitud(Float.parseFloat(vLt));
                pokemon.setPokemonLongitud(Float.parseFloat(vLg));



                service.create(pokemon).enqueue(new Callback<Pokemon>() {
                    @Override
                    public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                        Log.i("MAIN_APP",new Gson().toJson(response.body()));
                    }

                    @Override
                    public void onFailure(Call<Pokemon> call, Throwable t) {
                        Log.i("MAIN_APP","No se conecto ");
                    }
                });

            }
        });












    }
}