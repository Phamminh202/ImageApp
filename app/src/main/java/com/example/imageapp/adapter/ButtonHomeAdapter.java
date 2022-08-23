package com.example.imageapp.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imageapp.model.ButtonHome;
import com.example.imageapp.R;

import java.util.List;

public class ButtonHomeAdapter extends RecyclerView.Adapter {
    private Activity activity;
    private List<ButtonHome> buttonHomeList;

    public ButtonHomeAdapter(Activity activity, List<ButtonHome> buttonHomeList) {
        this.activity = activity;
        this.buttonHomeList = buttonHomeList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(R.layout.home_button,parent,false);
        ButtonHomeHolder buttonHomeHolder = new ButtonHomeHolder(view);
        return buttonHomeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ButtonHomeHolder buttonHomeHolder = (ButtonHomeHolder) holder;
        ButtonHome buttonHome = buttonHomeList.get(position);
        buttonHomeHolder.btnHome.setText(buttonHome.getContent());
    }

    @Override
    public int getItemCount() {
        return buttonHomeList.size();
    }

    public class ButtonHomeHolder extends RecyclerView.ViewHolder {
        Button btnHome;
        public ButtonHomeHolder(@NonNull View itemView) {
            super(itemView);
            btnHome = itemView.findViewById(R.id.btnHome);
        }
    }
}
