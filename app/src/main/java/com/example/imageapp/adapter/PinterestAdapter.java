package com.example.imageapp.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.imageapp.model.Pinterest;
import com.example.imageapp.R;

import java.util.List;

public class PinterestAdapter extends RecyclerView.Adapter {

    private Activity activity;
    private List<Pinterest> pinterestList;

    public PinterestAdapter(Activity activity, List<Pinterest> pinterestList) {
        this.activity = activity;
        this.pinterestList = pinterestList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =activity.getLayoutInflater().inflate(R.layout.home_item,parent,false);
        PinterestHolder pinterestHolder =new PinterestHolder(view);
        return pinterestHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PinterestHolder pinterestHolder = (PinterestHolder) holder;
        Pinterest pinterest = pinterestList.get(position);
        Glide.with(activity).load(pinterest.getImage()).into(pinterestHolder.ivImage);
        pinterestHolder.tvContent.setText(pinterest.getContent());
    }

    @Override
    public int getItemCount() {
        return pinterestList.size();
    }

    public class PinterestHolder extends RecyclerView.ViewHolder{
        ImageView ivImage;
        TextView tvContent;

        public PinterestHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivImage);
            tvContent = itemView.findViewById(R.id.tvContent);
        }
    }
}
