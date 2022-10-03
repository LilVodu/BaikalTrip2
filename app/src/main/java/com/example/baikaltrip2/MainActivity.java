package com.example.baikaltrip2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.lv);
        ListView listView = findViewById(R.id.recList);
        Product product1, product2, product3;




        product1 = new Product("1","ad1",
                getResources().getDrawable(R.drawable.start));
        product2 = new Product("2","ad2",
                getResources().getDrawable(R.drawable.starttwo));
        product3 = new Product("3","ad3",
                getResources().getDrawable(R.drawable.starttree));
        Product[] arr = {product1,product2,product3};

        ScrollAdapter myAdapter = new ScrollAdapter(this,arr);
        lv.setAdapter(myAdapter);
       ListAdapter listAdapter = new ListAdapter(this, arr);
        listView.setAdapter(listAdapter);






    }
}