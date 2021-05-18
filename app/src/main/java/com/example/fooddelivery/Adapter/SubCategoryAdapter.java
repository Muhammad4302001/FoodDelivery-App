package com.example.fooddelivery.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.Model.SubCategory;
import com.example.fooddelivery.R;

import java.util.ArrayList;


public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.SubCategoryView> {

    ArrayList<SubCategory> mSubCategory;

    public SubCategoryAdapter() {
    }

    public SubCategoryAdapter(ArrayList<SubCategory> mSubCategory) {
        this.mSubCategory = mSubCategory;
    }

    public class SubCategoryView extends RecyclerView.ViewHolder{

        ImageView sImgView;
        TextView sBigText;
        TextView sDescText;
        TextView sFoodPrice;

        public SubCategoryView(@NonNull View itemView) {
            super(itemView);

            sImgView = itemView.findViewById(R.id.imageSubCategory);
            sBigText = itemView.findViewById(R.id.textSubBig);
            sDescText = itemView.findViewById(R.id.textSubchield);
            sFoodPrice = itemView.findViewById(R.id.priceSub);

        }
    }

    @NonNull
    @Override
    public SubCategoryView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_food, parent, false);
        return new SubCategoryView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryView holder, int position) {

        holder.sImgView.setImageResource(mSubCategory.get(position).getImageResource());
        holder.sBigText.setText(mSubCategory.get(position).getFoodNameBig());
        holder.sDescText.setText(mSubCategory.get(position).getFoodDesc());
        holder.sFoodPrice.setText(mSubCategory.get(position).getFoodPrice());

    }

    @Override
    public int getItemCount() {
        return mSubCategory.size();
    }

}
