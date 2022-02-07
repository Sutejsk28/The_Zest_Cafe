package com.as2developers.thezestcafe.HomeScreen.HelperClasses;

public class OutletModelClass {
    int image;
    String name,desc,rating,startingAt,time;

    public OutletModelClass(int image, String name, String desc, String rating, String startingAt, String time) {
        this.image = image;
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.startingAt = startingAt;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getRating() {
        return rating;
    }

    public String getStartingAt() {
        return startingAt;
    }

    public String getTime() {
        return time;
    }
}
