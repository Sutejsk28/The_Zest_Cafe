package com.as2developers.thezestcafe.HomeScreen.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.as2developers.thezestcafe.HomeScreen.HelperClasses.OfferModelClass;
import com.as2developers.thezestcafe.R;

import java.util.ArrayList;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.OfferViewHolder> {

    ArrayList<OfferModelClass> offerList;
    Context context;

    public OfferAdapter(ArrayList<OfferModelClass> offerList, Context context) {
        this.offerList = offerList;
        this.context = context;
    }

    @NonNull
    @Override
    public OfferViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.offer_card,parent,false);
        return new OfferViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OfferViewHolder holder, int position) {

        OfferModelClass offerModelClass = offerList.get(position);

        holder.coupon.setText(offerModelClass.getCoupon());
        holder.offerImage.setImageResource(offerModelClass.getOfferImg());
        holder.quote.setText(offerModelClass.getQuote());

    }

    @Override
    public int getItemCount() {
        return offerList.size();
    }


    public static class OfferViewHolder extends RecyclerView.ViewHolder{

        ImageView offerImage;
        TextView quote,coupon;

        public OfferViewHolder(@NonNull View itemView) {
            super(itemView);
            offerImage = itemView.findViewById(R.id.offerCardimg);
            quote = itemView.findViewById(R.id.quote);
            coupon = itemView.findViewById(R.id.coupon);
        }
    }
}
