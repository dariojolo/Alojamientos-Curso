package com.dariojolo.alojamientos;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rodrigrl on 26/04/2016.
 */
public class HotelArrayAdapter <T> extends ArrayAdapter<T> {

        public HotelArrayAdapter(Context context, List<T> objects) {
            super(context, 0, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){

            //Obteniendo una instancia del inflater
            LayoutInflater inflater = (LayoutInflater)getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Salvando la referencia del View de la fila
            View listItemView = convertView;

            //Comprobando si el View no existe
            if (null == convertView) {
                //Si no existe, entonces inflarlo con two_line_list_item.xml
                listItemView = inflater.inflate(
                        R.layout.lista_layout,
                        parent,
                        false);
            }

            //Obteniendo instancias de los text views
            ImageView imagen = (ImageView)listItemView.findViewById(R.id.imagen);
            TextView titulo = (TextView)listItemView.findViewById(R.id.texto);

            //Obteniendo instancia de la Tarea en la posición actual
            T item = (T)getItem(position);

            titulo.setText();
            imagen.setImageResource(subCadenas[1]);

            //Devolver al ListView la fila creada
            return listItemView;

        }

}
