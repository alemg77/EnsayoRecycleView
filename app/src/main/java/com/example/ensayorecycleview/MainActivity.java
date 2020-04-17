package com.example.ensayorecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.MainRecyclerView);

        List<Personaje> personajeList = cargaDePersonajes();
        PersonajesAdapter personajesAdapter = new PersonajesAdapter(personajeList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(personajesAdapter);


    }

    public List<Personaje> cargaDePersonajes() {
        List<Personaje> listaPersonajes = new ArrayList<>();
        listaPersonajes.add(new Personaje("Batman", "DC Comics", "Dolares y super inconsistencia", R.drawable.batman));
        listaPersonajes.add(new Personaje("Superman", "DC Comics", "Fuerza y volar",R.drawable.superman));
        listaPersonajes.add(new Personaje("Spiderman", "Marvel", "Trepar, lanzar telaaraña", R.drawable.spiderman));
        listaPersonajes.add(new Personaje("Wolverine", "Marvel", "Curacion y Garras", R.drawable.wolverine));
        listaPersonajes.add(new Personaje("Ironman", "Marvel", "Hacer tecnologia, traje", R.drawable.ironman));
        listaPersonajes.add(new Personaje("Batman", "DC Comics", "Dolares y super inconsistencia", R.drawable.batman));
        listaPersonajes.add(new Personaje("Superman", "DC Comics", "Fuerza y volar",R.drawable.superman));
        listaPersonajes.add(new Personaje("Spiderman", "Marvel", "Trepar, lanzar telaaraña", R.drawable.spiderman));
        listaPersonajes.add(new Personaje("Wolverine", "Marvel", "Curacion y Garras", R.drawable.wolverine));
        listaPersonajes.add(new Personaje("Ironman", "Marvel", "Hacer tecnologia, traje", R.drawable.ironman));
        listaPersonajes.add(new Personaje("Batman", "DC Comics", "Dolares y super inconsistencia", R.drawable.batman));
        listaPersonajes.add(new Personaje("Superman", "DC Comics", "Fuerza y volar",R.drawable.superman));
        listaPersonajes.add(new Personaje("Spiderman", "Marvel", "Trepar, lanzar telaaraña", R.drawable.spiderman));
        listaPersonajes.add(new Personaje("Wolverine", "Marvel", "Curacion y Garras", R.drawable.wolverine));
        listaPersonajes.add(new Personaje("Ironman", "Marvel", "Hacer tecnologia, traje", R.drawable.ironman));
        listaPersonajes.add(new Personaje("Batman", "DC Comics", "Dolares y super inconsistencia", R.drawable.batman));
        listaPersonajes.add(new Personaje("Superman", "DC Comics", "Fuerza y volar",R.drawable.superman));
        listaPersonajes.add(new Personaje("Spiderman", "Marvel", "Trepar, lanzar telaaraña", R.drawable.spiderman));
        listaPersonajes.add(new Personaje("Wolverine", "Marvel", "Curacion y Garras", R.drawable.wolverine));
        listaPersonajes.add(new Personaje("Ironman", "Marvel", "Hacer tecnologia, traje", R.drawable.ironman));
        listaPersonajes.add(new Personaje("Batman", "DC Comics", "Dolares y super inconsistencia", R.drawable.batman));
        listaPersonajes.add(new Personaje("Superman", "DC Comics", "Fuerza y volar",R.drawable.superman));
        listaPersonajes.add(new Personaje("Spiderman", "Marvel", "Trepar, lanzar telaaraña", R.drawable.spiderman));
        listaPersonajes.add(new Personaje("Wolverine", "Marvel", "Curacion y Garras", R.drawable.wolverine));
        listaPersonajes.add(new Personaje("Ironman", "Marvel", "Hacer tecnologia, traje", R.drawable.ironman));
        return listaPersonajes;
    }
}
