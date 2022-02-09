package com.example.menu_page;

public class FoodModelClass {
    int  image;
    String foodname,foodprice;

    public FoodModelClass(int image, String foodname, String foodprice) {
        this.image = image;
        this.foodname = foodname;
        this.foodprice = foodprice;
    }

    public int getImage() {
        return image;
    }

    public String getFoodname() {
        return foodname;
    }

    public String getFoodprice() {
        return foodprice;
    }
}
