ackage com.cescristorey.recyclerview.ejemplorecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cescristorey.recyclerview.ejemplorecyclerview.R;

public class Salida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salida);
        TextView equipoTextView = (TextView)findViewById(R.id.equipoTv);
        TextView estadioTextView = (TextView)findViewById(R.id.estadioTv);
        TextView entrenadorTextView = (TextView)findViewById(R.id.estadioTv);

        equipoTextView.setText(this.getExtraData(String equipo)));
        estadioTextView.setText();
        entrenadorTextView.setText();
    }
}