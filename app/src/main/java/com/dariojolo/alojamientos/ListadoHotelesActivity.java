package com.dariojolo.alojamientos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListadoHotelesActivity extends AppCompatActivity {

    /*
Declarar instancias globales
*/
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_listado_hoteles);
       // TextView txtHoteles = (TextView)findViewById(R.id.txtHoteles);

        String idSeleccionado = getIntent().getExtras().getString("ID");

        // Inicializar Hoteles
        List items = new ArrayList();

        switch (idSeleccionado){
            case "1":{
                items.add(new Hotel("Hotel 11", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 12", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 13", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 14", "Direccion 1",R.drawable.foto));
                items.add(new Hotel("Hotel 15", "Direccion 1",R.drawable.foto));
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


// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new HotelAdapter(items,new HotelAdapter.OnItemClickListener() {
            @Override public void onItemClick(ContentItem item) {
                Toast.makeText(getContext(), "Item Clicked", Toast.LENGTH_LONG).show();
            }
        })););
        recycler.setAdapter(adapter);
    }

}
