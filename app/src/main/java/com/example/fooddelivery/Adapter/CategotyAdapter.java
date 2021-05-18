package com.example.fooddelivery.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.Model.Category;
import com.example.fooddelivery.Model.SubCategory;
import com.example.fooddelivery.R;
import com.example.fooddelivery.UpdateRecyclerView;

import java.util.ArrayList;


public class CategotyAdapter extends RecyclerView.Adapter<CategotyAdapter.CategoryView> {

    ArrayList<Category> categoryList;
    int row_index = -1;
    UpdateRecyclerView updateRecyclerView;
    Activity activity;
    boolean check = true;
    boolean select = true;

    public CategotyAdapter() {
    }

    public CategotyAdapter(ArrayList<Category> categoryList, UpdateRecyclerView updateRecyclerView, Activity activity) {
        this.categoryList = categoryList;
        this.updateRecyclerView = updateRecyclerView;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CategoryView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_food, parent, false);

        return new CategoryView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryView holder, int position) {


        holder.cImageView.setImageResource(categoryList.get(position).getImageResource());
        holder.cTextBig.setText(categoryList.get(position).getFoodName());

        if (check) {

            ArrayList<SubCategory> subCategoryArrayList = new ArrayList<SubCategory>();
            subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10000"));
            subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10002"));
            subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10003"));
            subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10004"));
            subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10005"));
            subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10006"));
            subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10007"));

            updateRecyclerView.callback(position, subCategoryArrayList);

            check = false;
        }

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();

                if (position == 0) {

                    ArrayList<SubCategory> subCategoryArrayList = new ArrayList<SubCategory>();
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10000"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10002"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10003"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10004"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10005"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10006"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood, "Palov", "Go'shtli", "10007"));

                    updateRecyclerView.callback(position, subCategoryArrayList);

                    check = false;
                } else if (position == 1) {
                    ArrayList<SubCategory> subCategoryArrayList = new ArrayList<SubCategory>();

                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood2, "Palov", "Go'shtli", "10000"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood2, "Palov", "Go'shtli", "10002"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood2, "Palov", "Go'shtli", "10003"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood2, "Palov", "Go'shtli", "10004"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood2, "Palov", "Go'shtli", "10005"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood2, "Palov", "Go'shtli", "10006"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood2, "Palov", "Go'shtli", "10007"));

                    updateRecyclerView.callback(position, subCategoryArrayList);

                    check = false;
                } else if (position == 2) {
                    ArrayList<SubCategory> subCategoryArrayList = new ArrayList<SubCategory>();

                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood3, "Palov", "Go'shtli", "10000"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood3, "Palov", "Go'shtli", "10002"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood3, "Palov", "Go'shtli", "10003"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood3, "Palov", "Go'shtli", "10004"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood3, "Palov", "Go'shtli", "10005"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood3, "Palov", "Go'shtli", "10006"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagefood3, "Palov", "Go'shtli", "10007"));

                    updateRecyclerView.callback(position, subCategoryArrayList);

                    check = false;
                } else if (position == 3) {

                    ArrayList<SubCategory> subCategoryArrayList = new ArrayList<SubCategory>();

                    subCategoryArrayList.add(new SubCategory(R.drawable.imagepalov, "Palov", "Go'shtli", "10000"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagepalov, "Palov", "Go'shtli", "10002"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagepalov, "Palov", "Go'shtli", "10003"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagepalov, "Palov", "Go'shtli", "10004"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagepalov, "Palov", "Go'shtli", "10005"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagepalov, "Palov", "Go'shtli", "10006"));
                    subCategoryArrayList.add(new SubCategory(R.drawable.imagepalov, "Palov", "Go'shtli", "10007"));

                    updateRecyclerView.callback(position, subCategoryArrayList);

                    check = false;

                }
            }
        });


        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.static_background_selected);

                select = false;
            } else {
            }

            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.static_background_selected);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.static_background_unselected);
            }
        }

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class CategoryView extends RecyclerView.ViewHolder {

        private ImageView cImageView;
        private TextView cTextBig;
        private LinearLayout cardView;

        public CategoryView(@NonNull View itemView) {
            super(itemView);

            cImageView = itemView.findViewById(R.id.imageCategory);
            cTextBig = itemView.findViewById(R.id.textBigCateg);
            cardView = itemView.findViewById(R.id.productLayout);

        }
    }
}
