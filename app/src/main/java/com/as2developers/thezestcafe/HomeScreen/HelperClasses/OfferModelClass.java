package com.as2developers.thezestcafe.HomeScreen.HelperClasses;

public class OfferModelClass {
    String quote,coupon;
    int offerImg;

    public OfferModelClass(String quote, String coupon, int offerImg) {
        this.quote = quote;
        this.coupon = coupon;
        this.offerImg = offerImg;
    }

    public int getOfferImg() {
        return offerImg;
    }

    public String getQuote() {
        return quote;
    }

    public String getCoupon() {
        return coupon;
    }
}
