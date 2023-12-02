package com.example.indianstates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    List<Item> actualList;

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.cardView);

        actualList = new ArrayList<>();

        Item item1 = new Item(R.drawable.maharashtra, "Maharashtra");
        Item item2 = new Item(R.drawable.gujarat, "Gujarat");
        Item item3 = new Item(R.drawable.jharkhand, "Jharkhand");
        Item item4 = new Item(R.drawable.karnataka, "Karnataka");
        Item item5 = new Item(R.drawable.kerala, "Kerala");

        actualList.add(item1);
        actualList.add(item2);
        actualList.add(item3);
        actualList.add(item4);
        actualList.add(item5);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        myAdapter = new MyAdapter(actualList);
        recyclerView.setAdapter(myAdapter);



    }
}