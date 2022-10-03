package com.example.baikaltrip2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class Product {

    public String adress;
    public String name;

    public Drawable image;


   public Product(String _name, String _adress, Drawable _image) {
        name = _name;
       adress = _adress;
        image = _image;

    }


}



