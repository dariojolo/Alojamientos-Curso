package com.dariojolo.alojamientos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Dario on 25/04/2016.
 */
public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {
    private List<Hotel> items;

    public Context context;

    public OnItemClickListener escucha;

    public interface OnItemClickListener {
        void onItemClick(RecyclerView.ViewHolder holder,int posicion);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.escucha = listener;
    }
    public OnItemClickListener getOnItemClickListener() {
        return escucha;
    }
    public class HotelViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView direccion;

        Context context_int;
        public HotelViewHolder(View v,Context context) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            direccion = (TextView) v.findViewById(R.id.visitas);
            context_int = context;
        }
        //implemento el método onClickListener
        @Override
        public void onClick(View view) {
            escucha.onItemClick(this,getAdapterPosition());
            Log.i("DARIO","CLICK");
            Toast.makeText(context_int,"Mensaje",Toast.LENGTH_LONG).show();


        }
    }
/*    public HotelAdapter(List<Hotel> items, OnItemClickListener listener) {
        this.items = items;
        this.escucha = listener;
    }*/

    public HotelAdapter(List<Hotel> items, OnItemClickListener onItemClickListener, Context contexto) {
        this.items = items;
        contexto = context;
    }
    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public HotelViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.hotel_card, viewGroup, false);
        return new HotelViewHolder(v,context);
    }

    @Override
    public void onBindViewHolder(HotelViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.direccion.setText(items.get(i).getDireccion());
    }
}
