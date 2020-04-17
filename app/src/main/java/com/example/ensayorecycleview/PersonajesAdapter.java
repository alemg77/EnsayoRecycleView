package com.example.ensayorecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonajesAdapter extends RecyclerView.Adapter {

    private List<Personaje> listaDePersonajes;

    public PersonajesAdapter(List<Personaje> personajeList) {
        listaDePersonajes = personajeList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewcelda = layoutInflater.inflate(R.layout.celda_personaje, parent, false);
        PersonajeViewHolder viewHolder = new PersonajeViewHolder(viewcelda);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Personaje unPersonajeAMostrar = listaDePersonajes.get(position);
        PersonajeViewHolder holderHolder = (PersonajeViewHolder) holder;
        ((PersonajeViewHolder) holder).cagarPersonaje(unPersonajeAMostrar);
    }

    @Override
    public int getItemCount() {
        return listaDePersonajes.size();
    }

    private class PersonajeViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagen;
        private TextView textViewNombre;
        private TextView textViewEditora;
        private TextView textViewPoder;

        public PersonajeViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.celdaPersonajeImageView);
            textViewEditora = itemView.findViewById(R.id.celdaPersonajeTextViewEditora);
            textViewNombre = itemView.findViewById(R.id.celdaPersonajeTextViewNombre);
        }

        public void cagarPersonaje ( Personaje unPersonaje ){
            imagen.setImageResource(unPersonaje.getImagen());
            textViewNombre.setText(unPersonaje.getNombre());
            textViewEditora.setText(unPersonaje.getEditora());

        }

    }
}
