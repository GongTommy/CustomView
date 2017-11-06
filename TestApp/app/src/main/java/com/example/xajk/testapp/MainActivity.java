package com.example.xajk.testapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.nereo.multi_image_selector.MultiImageSelector;
import me.nereo.multi_image_selector.MultiImageSelectorActivity;

public class MainActivity extends AppCompatActivity {

    private Map<String, List<Integer>> map = new HashMap<>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        map.put("21", a1);
        map.put("22", a1);
        map.put("23", a1);
        map.put("214", a1);

        Gson gson = new Gson();
        String json = gson.toJson(map);
        Log.i("MainActivity", "json------>>>>>:" + json);

    }


}
