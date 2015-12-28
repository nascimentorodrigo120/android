package com.example.irom.exemplocardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/*
vai funcionar do mesmo jeito que um adapter para listView
 */

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private CardAdapter adapter;
    private List<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        array = new ArrayList<>();
        array.add("dog");
        array.add("cat");
        array.add("bird");
        array.add("pig");
        array.add("monkey");

        list = (ListView)findViewById(R.id.listView);
        adapter = new CardAdapter(this,array);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"ANIMAL:  "+ array.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
