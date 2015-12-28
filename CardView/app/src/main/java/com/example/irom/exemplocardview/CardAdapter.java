package com.example.irom.exemplocardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by irom on 20/12/2015.
 */
public class CardAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<String> list;

    public CardAdapter(Context context, List<String> list) {
        this.list = list;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int position) {
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

            view.setTag(item);
        }
        else{
            item = (ItemSuporte) view.getTag();
        }

        String nome = list.get(position).toString();
        item.txtNome.setText(nome);

        return view;
    }



    private class ItemSuporte {

        TextView txtNome;
    }
}
