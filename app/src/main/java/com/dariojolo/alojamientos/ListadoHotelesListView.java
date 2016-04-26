package com.dariojolo.alojamientos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListadoHotelesListView extends AppCompatActivity {

    ListView lista;
    ArrayAdapter<Hotel> adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_hoteles_list_view);

        lista = (ListView)findViewById(R.id.lista);

        String idSeleccionado = getIntent().getExtras().getString("ID");

        // Inicializar Hoteles
        List items = new ArrayList();

        switch (idSeleccionado){
            case "1":{
                items.add(new Hotel("Majestic Hotel", "LIBERTAD 121",R.drawable.unaestrella_1));
                items.add(new Hotel("Palace Solis", "SOLIS 352",R.drawable.unaestrella_2));
                items.add(new Hotel("Condor Hotel", "La Rioja 258",R.drawable.unaestrella_3));
                items.add(new Hotel("Alfa", "Riobamba 1064",R.drawable.unaestrella_4));
                items.add(new Hotel("Du Helder Hotel", "Rivadavia 857",R.drawable.unaestrella_5));
                break;
            }
            case "2":{
                items.add(new Hotel("Hotel 21", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 22", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 23", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 24", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 25", "Direccion 1",R.drawable.foto));
                break;
            }
            case "3":{
                items.add(new Hotel("Hotel 31", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 32", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 33", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 34", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 35", "Direccion 1",R.drawable.foto));
                break;
            }
            case "4":{
                items.add(new Hotel("Hotel 41", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 42", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 43", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 44", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 45", "Direccion 1",R.drawable.foto));
                break;
            }
            case "5":{
                items.add(new Hotel("Hotel 51", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 52", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 53", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 54", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 55", "Direccion 1",R.drawable.foto));
                break;
            }
        }

        adaptador = new ArrayAdapter<String>(this,R.layout.lista_layout, items);

        lista.setAdapter(adaptador);


    }
}
