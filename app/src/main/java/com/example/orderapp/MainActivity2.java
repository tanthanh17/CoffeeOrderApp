package com.example.orderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        modelList = new ArrayList<>();
        modelList.add(new Model("Green Tea", getString(R.string.Greentea), R.drawable.traxanh));
        modelList.add(new Model("Latte", getString(R.string.Latte), R.drawable.latte));
        modelList.add(new Model("Cappuccino", getString(R.string.Cappuccino), R.drawable.cappuccino));
        modelList.add(new Model("Espresso", getString(R.string.Espresso), R.drawable.espresso));
        modelList.add(new Model("Americano", getString(R.string.Americano), R.drawable.americano));
        modelList.add(new Model("Macchiato", getString(R.string.Macchiato), R.drawable.macchiato));

        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);
    }
}
