package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Pinterest> pinterestList = new ArrayList<>();
    private List<ButtonHome> buttonHomeList = new ArrayList<>();
    ImageButton ibProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent shipper = getIntent();
        String username = shipper.getStringExtra("username");

        //Data
        initDataButton();
        initDataPinterest();


        //Adapter
        ButtonHomeAdapter buttonHomeAdapter = new ButtonHomeAdapter(this,buttonHomeList);
        PinterestAdapter pinterestAdapter =new PinterestAdapter(this,pinterestList);

        //Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager2 = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        //Recycle view
        RecyclerView rvButtonHome = findViewById(R.id.rvButtonHome);
        rvButtonHome.setLayoutManager(layoutManager);
        rvButtonHome.setAdapter(buttonHomeAdapter);

        RecyclerView rvPinterest =findViewById(R.id.rvPinterest);
        rvPinterest.setLayoutManager(layoutManager2);
        rvPinterest.setAdapter(pinterestAdapter);


        ibProfile = findViewById(R.id.ibProfile);
        ibProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toProfile();
            }
        });

    }

    private void initDataButton() {
        for (int i = 0; i < 3; i++) {
            buttonHomeList.add(new ButtonHome("For with you"));
            buttonHomeList.add(new ButtonHome("Hoang hon"));
            buttonHomeList.add(new ButtonHome("Phong canh"));
        }
    }

    private void initDataPinterest() {
        for (int i = 0; i < 50; i++) {
            pinterestList.add(new Pinterest(R.drawable.chieuta,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.galaxy,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.phongcanh,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.chieuta,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.galaxy,"Hình nền galaxy siêu đẹp"));
            pinterestList.add(new Pinterest(R.drawable.phongcanh,"Hình nền galaxy siêu đẹp"));
        }
    }


    private void toProfile() {
        Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
        startActivity(intent);
    }
}