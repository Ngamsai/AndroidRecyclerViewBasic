package com.example.navadroid.androidrecyclerviewbasic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Original: https://github.com/TRWxCH4MP/SampleRecyclerView

// Main adapter inherits RecyclerView.Adapter<BaseViewHolder>
// so there are some methods needed to be overridden

public class MainAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<BaseItem> itemList = new ArrayList<>();


    // Create the view that is holding our item
    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        if (viewType == ViewType.TYPE_CARD_VIEW) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            return new CardViewHolder(v);
        }
        throw new RuntimeException("Type doesn't not match");
    }

    // Bind the view holder (View) to the item (Model)
    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        BaseItem i = itemList.get(position);
        if (holder instanceof CardViewHolder) {
            CardViewItem cardViewItem = (CardViewItem) i;
            ((CardViewHolder) holder).setImage(cardViewItem.getImage());
            ((CardViewHolder) holder).setText(cardViewItem.getText());
        }
    }

    // The following methods used to operate list such as count, get, set
    @Override
    public int getItemCount() {
        if (!itemList.isEmpty()) { // || itemList != null) {
            return itemList.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getType();
    }

    public void setItemList(List<BaseItem> itemList) {
        this.itemList = itemList;
        notifyDataSetChanged();
    }
}
