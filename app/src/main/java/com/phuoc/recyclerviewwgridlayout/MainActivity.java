package com.phuoc.recyclerviewwgridlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        
        userAdapter.setData(getListData());
        recyclerView.setAdapter(userAdapter);

    }

    @NonNull
    private List<User> getListData() {
        List<User> list = new ArrayList<>();
        list.add(new User((R.drawable.backgroud_4), "Username1"));
        list.add(new User((R.drawable.background_2), "Username1"));
        list.add(new User((R.drawable.backgroud_4), "Username1"));
        list.add(new User((R.drawable.backgroud_4), "Username1"));
        list.add(new User((R.drawable.backgroud_4), "Username2"));
        list.add(new User((R.drawable.backgroud_4), "Username2"));
        list.add(new User((R.drawable.backgroud_4), "Username3"));
        list.add(new User((R.drawable.backgroud_4), "Username4"));
        list.add(new User((R.drawable.backgroud_4), "Username5"));
        list.add(new User((R.drawable.backgroud_4), "Username6"));
        list.add(new User((R.drawable.backgroud_4), "Username7"));

        return list;
    }
}