package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab5.adapter.DonutAdapter;
import com.example.lab5.models.Donut;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<Donut> listDonut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        listDonut = new ArrayList<Donut>();
        listDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$10.00", R.drawable.donut_yellow_1));
        listDonut.add(new Donut("Pink Donut", "Spicy tasty donut family", "$20.00", R.drawable.tasty_donut_1));
        listDonut.add(new Donut("Floating Donut", "Spicy tasty donut family", "$30.00", R.drawable.green_donut_1));
        listDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$30.00", R.drawable.donut_red_1));
        listDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$30.00", R.drawable.donut_red_1));

        DonutAdapter donutAdapter = new DonutAdapter(this, R.layout.donut_item, listDonut);
        listView.setAdapter(donutAdapter);
    }
}