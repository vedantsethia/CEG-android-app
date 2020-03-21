package com.example.mahi.navigationd;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class imagePager extends PagerAdapter{

    private  int[] image;
    private LayoutInflater layoutInflater;
    private Context context;

    public imagePager(int[]  image,Context context)
    {
        this.image=image;
        this.context=context;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    //@NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view =layoutInflater.inflate(image[position],container,false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position==0)
                {
                    Intent i=new Intent(context,ignou_activity.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    String url="http://ceg.rajasthan.gov.in/";
                    i.putExtra("url", url);
                    context.startActivity(i);

                }

                if(position==1)
                {
                    Intent i=new Intent(context,ignou_activity.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    //String url="https://stackoverflow.com/questions/7068873/how-can-i-disable-all-views-inside-the-layout";
                    //i.putExtra("url", url);
                    context.startActivity(i);


                }
                if(position==3)
                {
                    Intent i=new Intent(context,ignou_activity.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    String url="http://ceg.rajasthan.gov.in/";
                    i.putExtra("url", url);
                    context.startActivity(i);

                }

                if(position==4)
                {
                    Intent i=new Intent(context,ignou_activity.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    String url="https://stackoverflow.com/questions/7068873/how-can-i-disable-all-views-inside-the-layout";
                    i.putExtra("url", url);
                    context.startActivity(i);


                }

            }
        });


        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        View view =(View)object;
        container.removeView(view);
    }
}
