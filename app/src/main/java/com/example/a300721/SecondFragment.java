package com.example.a300721;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment implements Adapter.Callback {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Model> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new Adapter(arrayList,this::callback);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

    }


    private void initData() {
        arrayList = new ArrayList<>();

        arrayList.add(new Model("1", "Blank Space", "Taylor Swift", "3:12"));
        arrayList.add(new Model("2", "Watch me", "Silento", "5:22"));
        arrayList.add(new Model("3", "Erned It", "The Weekend", "4:10"));
        arrayList.add(new Model("4", "The Hills", "The Weekend", "3:42"));
        arrayList.add(new Model("5", "Blank Space", "Taylor Swift", "3:12"));
        arrayList.add(new Model("6", "Watch me", "Silento", "5:22"));
        arrayList.add(new Model("7", "Erned It", "The Weekend", "4:10"));
        arrayList.add(new Model("8", "The Hills", "The Weekend", "3:42"));
        arrayList.add(new Model("9", "Blank Space", "Taylor Swift", "3:12"));
        arrayList.add(new Model("10", "Watch me", "Silento", "5:22"));
        arrayList.add(new Model("11", "Erned It", "The Weekend", "4:10"));
        arrayList.add(new Model("12", "The Hills", "The Weekend", "3:42"));
        arrayList.add(new Model("13", "Blank Space", "Taylor Swift", "3:12"));
        arrayList.add(new Model("14", "Watch me", "Silento", "5:22"));
        arrayList.add(new Model("15", "Erned It", "The Weekend", "4:10"));
        arrayList.add(new Model("16", "The Hills", "The Weekend", "3:42"));
    }


    @Override
    public void callback(Model model) {
       Intent intent = new Intent(getActivity(),MainActivity2.class);
       startActivity(intent);
    }
}