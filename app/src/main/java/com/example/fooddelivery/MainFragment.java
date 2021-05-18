package com.example.fooddelivery;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fooddelivery.Adapter.CategotyAdapter;
import com.example.fooddelivery.Adapter.SubCategoryAdapter;
import com.example.fooddelivery.Model.Category;
import com.example.fooddelivery.Model.SubCategory;

import java.util.ArrayList;



public class MainFragment extends Fragment implements UpdateRecyclerView {

    View view;
    private RecyclerView mRecyclerView;
    private ArrayList<Category> categoryList;
    private RecyclerView pRecyclerView;
    private SubCategoryAdapter subCategoryAdapter;
    private ArrayList<SubCategory> subCategoryArrayList;

    public MainFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        mRecyclerView = view.findViewById(R.id.categoryRecyclerview);
        CategotyAdapter categotyAdapter = new CategotyAdapter(categoryList, this::callback,getActivity());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(categotyAdapter);

        //Product

        pRecyclerView = view.findViewById(R.id.productRecyclerview);
        subCategoryAdapter = new SubCategoryAdapter(subCategoryArrayList);
        pRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
        pRecyclerView.setAdapter(subCategoryAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.imagefood,"Pizza"));
        categoryList.add(new Category(R.drawable.imagefood2,"Parxezni"));
        categoryList.add(new Category(R.drawable.imagefood3,"Stake"));
        categoryList.add(new Category(R.drawable.imagepalov,"Milliy Taomlar"));

        subCategoryArrayList = new ArrayList<>();


    }

    @Override
    public void callback(int position, ArrayList<SubCategory> subCategoryArrayList) {
        subCategoryAdapter = new SubCategoryAdapter(subCategoryArrayList);
        subCategoryAdapter.notifyDataSetChanged();
        pRecyclerView.setAdapter(subCategoryAdapter);
    }
}