package com.example.menu_page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapterFood extends RecyclerView.Adapter<RecyclerAdapterFood.FoodViewHolder>{
   ArrayList<FoodModelClass>foodNameList;
   private Context context;

    public RecyclerAdapterFood(ArrayList<FoodModelClass> foodNameList, Context context) {
        this.foodNameList = foodNameList;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.food_items_layout,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
   FoodModelClass food=foodNameList.get(position);
   holder.FoodImage.setImageResource(food.getImage());
   holder.FoodName.setText(food.getFoodname());
   holder.FoodPrice.setText(food.getFoodprice());

    }

    @Override
    public int getItemCount() {
        return foodNameList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
         TextView FoodName,FoodPrice;
         ImageView FoodImage;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            FoodName=itemView.findViewById(R.id.textView_food);
            FoodPrice=itemView.findViewById(R.id.textView_price);
            FoodImage=itemView.findViewById(R.id.food_items);

        }
    }
}
