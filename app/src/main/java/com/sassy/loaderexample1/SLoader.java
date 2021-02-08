package com.sassy.loaderexample1;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

public class SLoader extends AsyncTaskLoader<List<String>> {

    public SLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public List<String> loadInBackground() {
        final String[] fruits = new String[]{"Apple","Strawberry","Lichi","Guava","Pineapple","Ornage"};
        final ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<fruits.length; i++){
            list.add(fruits[i]);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
