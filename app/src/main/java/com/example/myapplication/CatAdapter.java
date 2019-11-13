package com.example.myapplication;

import com.example.myapplication.model.Cats;

import java.util.List;

public class CatAdapter {
    private List<Cats> catsToAdapt;

    public void setData(List<Cats> catsToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.catsToAdapt = catsToAdapt;
    }

}
