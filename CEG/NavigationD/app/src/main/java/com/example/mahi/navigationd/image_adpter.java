package com.example.mahi.navigationd;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class image_adpter extends ArrayAdapter<String> {

    private  Context mConext;
    public  image_adpter(Activity context, ArrayList<String> url_string)
    {
        super(context,0,url_string);
        mConext=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.gallery_image,parent,false);
        }

       final  String cur_url=getItem(position);
        ImageView img=(ImageView)listItemView.findViewById(R.id.gallery_img);
        //img.setImageResource(R.drawable.ceg_campus);
        Picasso.with(mConext).load(cur_url).fit().centerCrop().into(img);
        return listItemView;
    }
}
