package com.example.fooddelivery.Model;

public class Category {

    int ImageResource;
    String FoodName;

    public Category() {
    }

    public Category(int imageResource, String foodName) {
        ImageResource = imageResource;
        FoodName = foodName;

    }

    public int getImageResource() {
        return ImageResource;
    }

    public void setImageResource(int imageResource) {
        ImageResource = imageResource;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

}
