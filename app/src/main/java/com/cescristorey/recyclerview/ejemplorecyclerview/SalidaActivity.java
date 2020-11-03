package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SalidaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salida);
        TextView equipoTextView = (TextView)findViewById(R.id.equipoTv);
        TextView estadioTextView = (TextView)findViewById(R.id.estadioTv);
        TextView entrenadorTextView = (TextView)findViewById(R.id.estadioTv);

        equipoTextView.setText(getIntent().getStringExtra("nombre"));
        estadioTextView.setText(getIntent().getStringExtra("estadio"));
        entrenadorTextView.setText(getIntent().getStringExtra("entrenador"));
    }
}
