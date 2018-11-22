package com.example.navadroid.androidrecyclerviewbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

// Original: https://github.com/TRWxCH4MP/SampleRecyclerView

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind recycleView
        recyclerView = findViewById(R.id.recycler_view);

        // TODO You can change the layout manager here.
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        // Set the adapter
        adapter = new MainAdapter();

        // Add list of items to adapter
        adapter.setItemList(createItem());

        // Bind adapter to recyclerView
        recyclerView.setAdapter(adapter);
    }

    // Test creating list of items
    private List<BaseItem> createItem() {
        List<BaseItem> itemList = new ArrayList<>();
        for(int item=0; item<10; item++) {
            itemList.add(new CardViewItem()
                    .setImage(R.drawable.ic_android_black_120dp)
                    .setText("Item #" + item));
        }
        return itemList;
    }
}
