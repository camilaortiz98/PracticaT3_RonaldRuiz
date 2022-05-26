package com.example.examen_t3.adapter;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen_t3.R;
import com.example.examen_t3.detallePokemos;
import com.example.examen_t3.entities.Pokemon;
import com.example.examen_t3.ingresarPokemon;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.NameViewHolder> {

    private List<Pokemon> data;

    public PokemonAdapter(List<Pokemon> data) {
        this.data = data;
    }

    @Override
    public PokemonAdapter.NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item_pokemon, parent,false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PokemonAdapter.NameViewHolder holder, int position) {


        TextView tvNombre = holder.itemView.findViewById(R.id.nombre);
        TextView tvtipo = holder.itemView.findViewById(R.id.tipo);


        Pokemon anim = data.get(position);

        tvNombre.setText(anim.getNombrePokemon());
        tvtipo.setText(anim.getTipoPokemon());






        Button botonDetalle = holder.itemView.findViewById(R.id.btdetalle);
        botonDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN_APP", "Click en el bton2");

                Intent intent = new Intent(holder.itemView.getContext(), detallePokemos.class);
                holder.itemView.getContext().startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class NameViewHolder extends RecyclerView.ViewHolder{

        public NameViewHolder( View itemView) {
            super(itemView);
        }
    }
}
