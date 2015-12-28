package com.example.irom.exemplocardview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by irom on 20/12/2015.
 */
public class CardAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Carros> list;

    public CardAdapter(Context context, List<Carros> list) {
        this.list = list;
        this.mInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Carros getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        ItemSuporte item;

        if (view == null){
            view = mInflater.inflate(R.layout.adapter_card_view, null);

            item = new ItemSuporte();
            item.txtNome = (TextView) view.findViewById(R.id.textViewNome);
            item.txtMarca = (TextView) view.findViewById(R.id.textViewMarca);
            item.txtTipo = (TextView) view.findViewById(R.id.textViewTipo);
            item.imageView = (ImageView) view.findViewById(R.id.imageView);


            view.setTag(item);
        }
        else{
            item = (ItemSuporte) view.getTag();
        }

        Carros carro = list.get(position);
        item.txtNome.setText(carro.getNome());
        item.txtMarca.setText(carro.getMarca());
        item.txtTipo.setText(carro.getTipo());
        item.imageView.setImageResource(carro.getIcone());



        return view;
    }



    private class ItemSuporte {

        TextView txtNome;
        TextView txtMarca;
        TextView txtTipo;
        ImageView imageView;
    }

}
