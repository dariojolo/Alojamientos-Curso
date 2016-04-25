package com.dariojolo.alojamientos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListadoHotelesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_hoteles);
        TextView txtHoteles = (TextView)findViewById(R.id.txtHoteles);
        txtHoteles.setText(getIntent().getExtras().getString("ID"));
    }
}
