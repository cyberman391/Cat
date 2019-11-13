package com.example.myapplication.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.CatAdapter;
import com.example.myapplication.R;

public class FavoritesRecyclerFragment extends Fragment {
    RecyclerView recyclerView;
    public FavoritesRecyclerFragment() {
        // Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cat_recycler, container, false);
        recyclerView = view.findViewById(R.id.rv_cat);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        final CatAdapter catAdapter = new CatAdapter();
        final RequestQueue requestQueue =  Volley.newRequestQueue(getActivity());
        String url = "https://api.thecatapi.com/v1/breeds/search?q=";
        return null;

    };
}
