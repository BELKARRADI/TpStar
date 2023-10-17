package com.example.starapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.starapplication.Services.StarService;
import com.example.starapplication.entities.Star;
import com.example.starapplication.Adapter.starAdapter;
import com.example.starapplication.Services.StarService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Star> stars;
    private StarService service;
    private RecyclerView recyclerView;
    private starAdapter starAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stars = new ArrayList<>();
        service =  StarService.getInstance();
        init();
        recyclerView = findViewById(R.id.recyclerView);
        starAdapter starAdapter = null;
        starAdapter = new starAdapter(this, service.findAll());
        recyclerView.setAdapter(starAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));


    }
    public void init(){

        service.create(new Star("leeuw med", "https://images.unsplash.com/photo-1577880216142-8549e9488dad?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=200&ixid=MnwxfDB8MXxyYW5kb218MHx8bWFufHx8fHx8MTY5NzQwMDYxOA&ixlib=rb-4.0.3&q=80&utm_campaign=api-credit&utm_medium=referral&utm_source=unsplash_source&w=300", 4));
        service.create(new Star("george clooney", "https://images.unsplash.com/photo-1607990281513-2c110a25bd8c?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=500&ixid=MnwxfDB8MXxyYW5kb218MHx8bWFufHx8fHx8MTY5NzQwMDMzMQ&ixlib=rb-4.0.3&q=80&utm_campaign=api-credit&utm_medium=referral&utm_source=unsplash_source&w=300", 3));



    }

}
