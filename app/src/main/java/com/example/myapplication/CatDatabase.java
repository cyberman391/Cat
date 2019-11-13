package com.example.myapplication;

import com.example.myapplication.model.Cats;

import java.util.HashMap;
import java.util.List;

public class CatDatabase {
    public static final HashMap<String, Cats> cats = new HashMap<>();
    public static List<Cats> getAllCats() {
        return (List) cats.values();
    }
    public static void saveCatsToFakeDatabase(List<Cats> catsToSave) {
        for(int i = 0; i < catsToSave.size(); i++) {
            Cats cats = catsToSave.get(i);
            //cats.put(cats.getId(), cats);
        }
    }
}
