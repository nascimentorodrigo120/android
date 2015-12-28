package com.example.irom.exemplocardview2;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

// não pode usar cardView Com outros botões dentro.

public class MainActivity extends AppCompatActivity  {

    private ListView list;
    private CardAdapter adapter;
    private List<Carros> array;
    private Carros car;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        array = new ArrayList<>();
        array.add(new Carros("Bravo","FIAT","Hatch", R.drawable.bravo));
        array.add(new Carros("Cruze Sport6","Chevrolet","Hatch", R.drawable.cruze));
        array.add(new Carros("Golf GTI","Wolskvagem","Hatch", R.drawable.golf));
        array.add(new Carros("i30", "Hyundai", "Hatch", R.drawable.hyndai));

        list = (ListView)findViewById(R.id.listView);
        adapter = new CardAdapter(this,array);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               car = array.get(position);
               dialog(car);
            }
        });


    }

    public void delete(View view){

        Toast.makeText(this, car.getNome()+" deletado", Toast.LENGTH_SHORT).show();
    }


    public void dialog(Carros car){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(car.getNome());
        builder.setIcon(car.getIcone());
        builder.setMessage(car.getNome()+"\n"+car.getMarca()+"\n"+car.getTipo());

        builder.create();
        builder.show();
    }











    //   Toast.makeText(this, "deletado", Toast.LENGTH_SHORT).show();





}
