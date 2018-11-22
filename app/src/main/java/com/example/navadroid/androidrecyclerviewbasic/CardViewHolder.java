package com.example.navadroid.androidrecyclerviewbasic;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Original: https://github.com/TRWxCH4MP/SampleRecyclerView

// Our customized view holder
// holding all views that we want to show for each item (match with list_item.xml)
// In this case, there are one image view and one text view (both are encapsulated)

public class CardViewHolder extends BaseViewHolder{
    private ImageView imageView;
    private TextView textView;
    public CardViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
    }
    public void setImage(int image) {
        imageView.setImageResource(image);
    }
    public void setText(String text) {
        textView.setText(text);
    }
}
