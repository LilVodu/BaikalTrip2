package com.example.baikaltrip2;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ScrollAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    Product[] objects;

    public ScrollAdapter(Context context, Product[] arrayList) {
        ctx = context;
        objects = arrayList;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {

        return objects.length;
    }

    @Override
    public Object getItem(int i) {

        return objects[i];
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view1, ViewGroup viewGroup) {
        View view = view1;
        if (view == null) {
            view = lInflater.inflate(R.layout.item_list, viewGroup, false);
        }
        Product p = (Product) getItem(i);
        ((TextView) view.findViewById(R.id.adapter_Name)).setText(p.name);
        ((TextView) view.findViewById(R.id.adapter_Adress)).setText(p.adress);


        Drawable d = p.image;

        view.setBackground(d);
        return view;


    }
}
