package com.example.ensayorecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallePersonaje extends AppCompatActivity {

    public final static String KEY_NOMBRE_PERSONAJE = "1";
    public final static String KEY_IMAGEN_PERSONAJE = "2";
    public final static String KEY_PODER_PERSONAJE = "3";

    private TextView textViewNombre, textViewPoderes;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_personaje);

        textViewNombre = findViewById(R.id.DetalleNombrePersonaje);
        textViewPoderes = findViewById(R.id.DetallePoderes);
        imageView = findViewById(R.id.DetalleImagen);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String nombre = extras.getString(KEY_NOMBRE_PERSONAJE);
        int imagenPersonaje = extras.getInt(KEY_IMAGEN_PERSONAJE);
        String poder = extras.getString(KEY_PODER_PERSONAJE);

        imageView.setImageResource(imagenPersonaje);
        textViewNombre.setText(nombre);
        textViewPoderes.setText(poder);

    }
}
