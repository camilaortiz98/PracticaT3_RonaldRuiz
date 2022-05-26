package com.example.examen_t3;

import com.example.examen_t3.entities.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PokemonService {

    @GET("pokemons/n00026011")
    Call<List<Pokemon>> allPokemon();

    @POST("pokemons/n00026011/crear")
    Call<Pokemon> create(@Body Pokemon pokemon);
}
