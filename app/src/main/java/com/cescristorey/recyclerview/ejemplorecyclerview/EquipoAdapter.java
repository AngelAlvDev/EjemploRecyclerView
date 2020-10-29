package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis on 23/10/2017.
 */

public class EquipoAdapter
        extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {

    /*Arraylist donde almaceno los datos que se van a mostrar en el RecylerView*/
    private ArrayList<Equipo> datos;

    /* Incluyo el Viewholder en el Adapter */
    public static class EquipoViewHolder
            extends RecyclerView.ViewHolder {
        /* Como atributos se incluyen los elementos que van a referenciar a los elementos de la vista*/
        private TextView tvEquipo;
        private TextView tvEstadio;
        private TextView tvEntrenador;

        /*constructor con parámetro de la vista*/
        public EquipoViewHolder(View itemView) {
            super(itemView);
            // Asocia los atributos a los widgets del layout de la vista
            tvEquipo = (TextView)itemView.findViewById(R.id.tvEquipo);
            tvEstadio = (TextView)itemView.findViewById(R.id.tvEstadio);
            tvEntrenador = (TextView)itemView.findViewById(R.id.tvEntrenador);
        }

        /*Muestra los datos de equipo en el item*/
        public void bindEquipo(Equipo equipo) {
            tvEquipo.setText(equipo.getNom_equipo());
            tvEstadio.setText(equipo.getEstadio());
            tvEntrenador.setText(equipo.getEntrenador());
        }
    }


    /* Constructor con parámetros*/
    public EquipoAdapter(ArrayList<Equipo> datos) {
        this.datos = datos;
    }

    @Override
    public EquipoViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        /*Crea la vista de un item y la "pinta"*/
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_equipo, viewGroup, false);
        /* Crea un objeto de la clase EquipoViewHolder, pasándole la vista anteriormente creada*/
        EquipoViewHolder equipoVH = new EquipoViewHolder(itemView);
        /* devuelve la vista*/
        return equipoVH;
    }

    @Override
    public void onBindViewHolder(EquipoViewHolder viewHolder, int pos) {
        Equipo equipo = datos.get(pos);
        /* Llama a bindCoche, para que "pinte" los datos del equipo que se le pasa como parámetro*/
        viewHolder.bindEquipo(equipo);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

}
