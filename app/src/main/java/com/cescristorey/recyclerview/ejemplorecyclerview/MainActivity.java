package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

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
        datos.add(new Equipo("Deportivo Alaves","Mendizorroza","Pablo Machin"));
        datos.add(new Equipo("Sociedad Deportiva Eibar","Ipurua","Jose Luis Mendilibar"));
        datos.add(new Equipo("Club Atletico Osasona","El Sadar","Jagoba Arrasate"));
        datos.add(new Equipo("Levante Union Deportiva","Camilo Cano","Paco Lopez"));
        datos.add(new Equipo("Real Valladolid Club de Futbol","Jose Zorrilla","Sergio Gonzalez Soriano"));
        datos.add(new Equipo("Sociedad Deportiva Huesca","El Alcoraz","Francisco Rodriguez Vilchez"));
        datos.add(new Equipo("Cadiz Club de Futbol","Ramon de Carranza ","Oscar Arias"));
        datos.add(new Equipo("Elche Club de Futbol","Manuel Martinez Valero","Jose Rojo Martin"));
        datos.add(new Equipo("Club Deportio Leganes","Municipal Butarque","Javier Aguirre"));

        //Inicialización RecyclerView
        recyclerView = findViewById(R.id.RecView);
        recyclerView.setHasFixedSize(false);

        //Crea el adaptador, pasándole como parámetro los datos
        final EquipoAdapter adaptador = new EquipoAdapter(datos, new EquipoAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Equipo item) {
                Intent buttonIntent = null;

                buttonIntent = new Intent(getApplicationContext(),Salida.class);
                String a = item.getEntrenador();
                String b = item.getEstadio();
                String c = item.getNom_equipo();

                buttonIntent.putExtra("nombre", c);
                buttonIntent.putExtra("estadio",b);
                buttonIntent.putExtra("entrendador",a);
                startActivity(buttonIntent);
            }
        });

        //Asocia a recylerView el adaptador
        recyclerView.setAdapter(adaptador);

        //Fija un layout linear al recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        recyclerView.addItemDecoration(
                new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        // Pone la animación por defecto
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
