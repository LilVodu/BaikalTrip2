package com.example.baikaltrip2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    Product[] objects;

    public ListAdapter(Context context, Product[] arrayList) {
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
            view = lInflater.inflate(R.layout.item, viewGroup, false);
        }
        Product p = (Product) getItem(i);
        ((TextView) view.findViewById(R.id.textView12)).setText(p.name);
        ((ImageView) view.findViewById(R.id.imageViewProduct)).setImageDrawable(p.image);



        return view;


    }
}