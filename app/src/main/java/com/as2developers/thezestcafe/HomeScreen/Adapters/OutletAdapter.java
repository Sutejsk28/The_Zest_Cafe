package com.as2developers.thezestcafe.HomeScreen.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.as2developers.thezestcafe.HomeScreen.HelperClasses.OutletModelClass;
import com.as2developers.thezestcafe.R;

import java.util.ArrayList;

public class OutletAdapter extends RecyclerView.Adapter<OutletAdapter.OutletViewHolder> {

    ArrayList<OutletModelClass> outletList;
    Context context;

    public OutletAdapter(ArrayList<OutletModelClass> outletList, Context context) {
        this.outletList = outletList;
        this.context = context;
    }

    @NonNull
    @Override
    public OutletViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.outlet_card,parent,false);
        return new OutletViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OutletViewHolder holder, int position) {

        OutletModelClass outletModelClass = outletList.get(position);

        holder.outletDesc.setText(outletModelClass.getDesc());
        holder.outletName.setText(outletModelClass.getName());
        holder.outletRating.setText(outletModelClass.getRating());
        holder.outletStartingAt.setText(outletModelClass.getStartingAt());
        holder.outletTime.setText(outletModelClass.getTime());
        holder.outletImage.setImageResource(outletModelClass.getImage());

    }

    @Override
    public int getItemCount() {
        return outletList.size();
    }

    public static class OutletViewHolder extends RecyclerView.ViewHolder{

        ImageView outletImage;
        TextView outletName,outletDesc,outletTime,outletStartingAt,outletRating;

        public OutletViewHolder(@NonNull View itemView) {
            super(itemView);
            outletImage = itemView.findViewById(R.id.outlet_img);
            outletName = itemView.findViewById(R.id.outlet_name);
            outletDesc = itemView.findViewById(R.id.outlet_desc);
            outletTime = itemView.findViewById(R.id.outlet_time);
            outletRating = itemView.findViewById(R.id.rating);
            outletStartingAt = itemView.findViewById(R.id.starting_at);
        }
    }
}
