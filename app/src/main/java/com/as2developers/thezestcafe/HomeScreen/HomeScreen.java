package com.as2developers.thezestcafe.HomeScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.as2developers.thezestcafe.HomeScreen.Adapters.OfferAdapter;
import com.as2developers.thezestcafe.HomeScreen.Adapters.OutletAdapter;
import com.as2developers.thezestcafe.HomeScreen.HelperClasses.OfferModelClass;
import com.as2developers.thezestcafe.HomeScreen.HelperClasses.OutletModelClass;
import com.as2developers.thezestcafe.R;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    RecyclerView offer,outlet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        this.getSupportActionBar().hide();

        offer = findViewById(R.id.recycler01);
        outlet = findViewById(R.id.recycler02);

        setOffer();
        setOutlet();
    }

    private void setOutlet() {
        ArrayList<OutletModelClass> outletList = new ArrayList<>();

        outletList.add(new OutletModelClass(R.drawable.outlet1image,"ZEST GIT","North Indian,Snacks, Desserts","4.5","299 for one","30min | 12km"));
        outletList.add(new OutletModelClass(R.drawable.outlet2image,"ZEST CAFE","North Indian,Snacks, Desserts","4.0","449 for one","15min | 6km"));
        outletList.add(new OutletModelClass(R.drawable.outlet3img,"ZEST SBGIT","North Indian,Snacks, Desserts","3.5","350 for one","45min | 8km"));

        OutletAdapter outletAdapter = new OutletAdapter(outletList,this);
        outlet.setAdapter(outletAdapter);
        outlet.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void setOffer() {
        ArrayList<OfferModelClass> offerList = new ArrayList<>();

        offerList.add(new OfferModelClass("Get 50% off\non your first order","Use Coupon : WELCOME50",R.drawable.offercardimg));
        offerList.add(new OfferModelClass("Get 50% off\non your first order","Use Coupon : WELCOME50",R.drawable.offercardimg));
        offerList.add(new OfferModelClass("Get 50% off\non your first order","Use Coupon : WELCOME50",R.drawable.offercardimg));
        offerList.add(new OfferModelClass("Get 50% off\non your first order","Use Coupon : WELCOME50",R.drawable.offercardimg));

        OfferAdapter offerAdapter = new OfferAdapter(offerList,this);
        offer.setAdapter(offerAdapter);
        offer.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}