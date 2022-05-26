package com.example.examen_t3.entities;

import com.google.gson.annotations.SerializedName;

public class Pokemon {
    @SerializedName("nombre")
    private String nombrePokemon;
    @SerializedName("tipo")
    private String tipoPokemon;
    @SerializedName("url_imagen")
    private String urlPokemon;
    @SerializedName("latitude")
    private float pokemonLatitud;
    @SerializedName("longitude")
    private float pokemonLongitud;

    public Pokemon() {
    }

    public Pokemon(String nombrePokemon, String tipoPokemon, String urlPokemon, float pokemonLatitud, float pokemonLongitud) {
        this.nombrePokemon = nombrePokemon;
        this.tipoPokemon = tipoPokemon;
        this.urlPokemon = urlPokemon;
        this.pokemonLatitud = pokemonLatitud;
        this.pokemonLongitud = pokemonLongitud;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public String getUrlPokemon() {
        return urlPokemon;
    }

    public void setUrlPokemon(String urlPokemon) {
        this.urlPokemon = urlPokemon;
    }

    public Number getPokemonLatitud() {
        return pokemonLatitud;
    }

    public void setPokemonLatitud(float pokemonLatitud) {
        this.pokemonLatitud = pokemonLatitud;
    }

    public Number getPokemonLongitud() {
        return pokemonLongitud;
    }

    public void setPokemonLongitud(float pokemonLongitud) {
        this.pokemonLongitud = pokemonLongitud;
    }
}
