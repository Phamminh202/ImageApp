package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    private List<Pinterest> pinterestList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Data
        initData();

        //Adapter
        PinterestAdapter pinterestAdapter =new PinterestAdapter(this,pinterestList);

        //Layout Manager
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        //Recycle view
        RecyclerView rvPinterest =findViewById(R.id.rvPinterest);
        rvPinterest.setLayoutManager(layoutManager);
        rvPinterest.setAdapter(pinterestAdapter);
    }
    private void initData() {
        for (int i = 0; i < 50; i++) {
            pinterestList.add(new Pinterest(R.drawable.chieuta,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.galaxy,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.phongcanh,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.chieuta,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.galaxy,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.phongcanh,"Hình nền galaxy siêu đẹp"));
        }
    }
}