package com.example.indianstates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Item> itemList;

    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);

         return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
         Item item = itemList.get(position);


         holder.stateImage.setImageResource(item.getImageId());
         holder.name.setText(item.getStateName());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView stateImage;
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            stateImage = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
        }
    }
}
