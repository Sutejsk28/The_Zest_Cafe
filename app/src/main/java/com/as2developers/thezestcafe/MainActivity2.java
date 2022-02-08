package com.as2developers.thezestcafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView rv;
    Intent intent;
    String userid,a;
    private OrderAdapter orderadapt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rv=findViewById(R.id.recyclerview);
        System.out.println("test");
        LinearLayoutManager l = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(l);
        ArrayList<String> dishes = new ArrayList<>();
        dishes.add("Chicken briyani");
        dishes.add("TavaKari roast");
        dishes.add("Mutton  gravy");
        orderadapt=new OrderAdapter(this, dishes);

        rv.setAdapter(orderadapt);
    }
}