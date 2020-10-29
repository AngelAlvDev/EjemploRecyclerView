package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicialización de la lista de datos de ejemplo
        ArrayList<Equipo> datos = new ArrayList<>();
        datos.add(new Equipo("FC Barcelona", "Camp Nou", "Ronald Koeman"));
        datos.add(new Equipo("Real Madrid Club de Futbol","Metropolitano","Diego Simeone"));
        datos.add(new Equipo("Sevilla Club de Futbol","Ramon Sanchez Pizjuan","Julen Lopetegui"));
        datos.add(new Equipo("Real Betis Bolmpie","Benito Villamarin","Mauel Pellegrini"));
        datos.add(new Equipo("Real Sociedad de Futbol","Reale Arena","Imanol Algualcil"));
        datos.add(new Equipo("Valencia Club de Futbol","Mestalla","Javi Garcia"));
        datos.add(new Equipo("Villareal Club de Futbol","Estadio de la Ceramica","Fernando Roig Alfonso"));
        datos.add(new Equipo("Ahtletic Club","San Mames","Gaizka Garitano"));
        datos.add(new Equipo("Real Club Celta de Vigo","Balaidos","Oscar Garcia Junyent"));
        datos.add(new Equipo("Granada Club de Futbol","Nuevo Los Carmenes","Diego Martinez Penas"));
        datos.add(new Equipo("Getafe Club de Futbol","Coliseum Alfonso Perez","Jose Bordalas"));

        //Inicialización RecyclerView
        recyclerView = findViewById(R.id.RecView);
        recyclerView.setHasFixedSize(false);

        //Crea el adaptador, pasándole como parámetro los datos
        final EquipoAdapter adaptador = new EquipoAdapter(datos);

        //Asocia a recylerView el adaptador
        recyclerView.setAdapter(adaptador);

        //Fija un layout linear al recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
