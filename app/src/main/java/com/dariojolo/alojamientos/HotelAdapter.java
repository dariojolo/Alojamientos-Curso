package com.dariojolo.alojamientos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dario on 25/04/2016.
 */
public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {

    private List<Hotel> items;

    public interface OnItemClickListener {
        void onItemClick(RecyclerView.ViewHolder holder);
    }

    public OnItemClickListener escucha;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.escucha = listener;
    }

    public OnItemClickListener getOnItemClickListener() {
        return escucha;
    }

    public static class HotelViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView direccion;

        private HotelAdapter padre = null;

        public HotelViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            direccion = (TextView) v.findViewById(R.id.visitas);
        }
        @Override
        public void onClick(View v) {
            final OnItemClickListener listener = padre.getOnItemClickListener();
            if (listener != null) {
                listener.onItemClick(this);
            }
        }
    }

    public HotelAdapter(List<Hotel> items, OnItemClickListener listener) {
        this.items = items;
        this.escucha = listener;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public HotelViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.hotel_card, viewGroup, false);
        return new HotelViewHolder(v);
    }

    @Override
    public void onBindViewHolder(HotelViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.direccion.setText(items.get(i).getDireccion());
    }
}
