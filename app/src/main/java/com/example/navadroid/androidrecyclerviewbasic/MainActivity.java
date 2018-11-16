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

        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        adapter = new MainAdapter();
        adapter.setItemList(createItem());
        recyclerView.setAdapter(adapter);
    }

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
