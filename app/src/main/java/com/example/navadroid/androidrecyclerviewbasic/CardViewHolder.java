package com.example.navadroid.androidrecyclerviewbasic;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Original: https://github.com/TRWxCH4MP/SampleRecyclerView

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
