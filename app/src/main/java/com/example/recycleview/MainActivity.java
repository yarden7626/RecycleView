package com.example.recycleview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    int[] images = {R.drawable.icon1,R.drawable.icon2,
            R.drawable.icon3,R.drawable.icon4,R.drawable.icon5,R.drawable.icon6,
            R.drawable.icon7,R.drawable.icon8,R.drawable.icon9,R.drawable.icon10,
            R.drawable.icon11,R.drawable.icon12,R.drawable.icon13,R.drawable.icon14,
            R.drawable.icon15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<MyItem> itemList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
           itemList.add(new MyItem("text " + (i + 1), "text " + (i + 1), images[i]));

        }

        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}
