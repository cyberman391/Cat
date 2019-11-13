package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Cats {
    @SerializedName("weight")
    private int weight;
    private String id;
    private String name;
    private ArrayList<Cats> temperament;

    public int getWeight() { return weight; }

    public String getId() { return id; }

    public String getName() { return name; }

    public ArrayList<Cats> getTemperament() { return temperament; }
}
