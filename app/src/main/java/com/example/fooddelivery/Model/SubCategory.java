package com.example.fooddelivery.Model;

public class SubCategory {

    int ImageResource;
    String FoodNameBig;
    String FoodDesc;
    String FoodPrice;

    public SubCategory() {
    }

    public SubCategory(int imageResource, String foodNameBig, String foodDesc, String foodPrice) {
        ImageResource = imageResource;
        FoodNameBig = foodNameBig;
        FoodDesc = foodDesc;
        FoodPrice = foodPrice;
    }

    public int getImageResource() {
        return ImageResource;
    }

    public void setImageResource(int imageResource) {
        ImageResource = imageResource;
    }

    public String getFoodNameBig() {
        return FoodNameBig;
    }

    public void setFoodNameBig(String foodNameBig) {
        FoodNameBig = foodNameBig;
    }

    public String getFoodDesc() {
        return FoodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        FoodDesc = foodDesc;
    }

    public String getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        FoodPrice = foodPrice;
    }
}
