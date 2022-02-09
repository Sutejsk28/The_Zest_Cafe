package com.example.menu_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView;
     RecyclerAdapterFood adapterFood;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView_Id);

        ArrayList<FoodModelClass>list=new ArrayList<>();

        list.add(new FoodModelClass(R.drawable.veg_burger_1,"Burger","Rs 100"));
        list.add(new FoodModelClass(R.drawable.idli_sambhar_2,"idli","Rs 120"));
        list.add(new FoodModelClass(R.drawable.kadai_paneer_3,"kadai","Rs 200"));
        list.add(new FoodModelClass(R.drawable.pizza_4,"Pizza","Rs 180"));
        list.add(new FoodModelClass(R.drawable.dosa_5,"Dosa","Rs 80"));
        list.add(new FoodModelClass(R.drawable.chaat_6,"Chaat","Rs 90"));
        list.add(new FoodModelClass(R.drawable.sandwich_7,"Sandwich","Rs 10"));
        list.add(new FoodModelClass(R.drawable.cake_8,"Cake","Rs 500"));
         adapterFood=new RecyclerAdapterFood(list,this);
        recyclerView.setAdapter(adapterFood);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));


    }
}