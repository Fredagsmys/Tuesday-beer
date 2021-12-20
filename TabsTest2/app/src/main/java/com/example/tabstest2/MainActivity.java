package com.example.tabstest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ViewPager2 vpVertical,vpHorizontal;
    int[] images = {R.drawable.one,R.drawable.two};
    int[] layouts = {R.layout.layout1, R.layout.layout2};
    MainAdapter adapter;
    MainAdapter2 adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpVertical = findViewById(R.id.vp_vertical);
        vpHorizontal = findViewById(R.id.vp_horizontal);

        adapter = new MainAdapter(images);
        adapter2 = new MainAdapter2(layouts,getApplicationContext());

        vpVertical.setAdapter(adapter);
        vpHorizontal.setAdapter(adapter2);

        //NOT NECESSARY
        vpHorizontal.setClipToPadding(false);
        vpHorizontal.setClipChildren(false);
        vpHorizontal.setOffscreenPageLimit(3);
        vpHorizontal.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);



        //TRANSFORMER

        CompositePageTransformer transformer = new CompositePageTransformer();

        transformer.addTransformer(new MarginPageTransformer(8));

        transformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float v = 1- Math.abs(position);

                page.setScaleY(0.8f + v * 0.2f);

            }
        });
        vpHorizontal.setPageTransformer(transformer);
    }
}