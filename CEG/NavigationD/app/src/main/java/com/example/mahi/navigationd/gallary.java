package com.example.mahi.navigationd;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class gallary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<String> url_string=new ArrayList<String>();
        url_string.add("https://i.imgur.com/tGbaZCY.jpg");
        url_string.add("https://i.imgur.com/tGbaZCY.jpg");
        url_string.add("https://i.imgur.com/tGbaZCY.jpg");
        url_string.add("https://i.imgur.com/tGbaZCY.jpg");
        url_string.add("https://i.imgur.com/tGbaZCY.jpg");
        url_string.add("https://i.imgur.com/tGbaZCY.jpg");
        url_string.add("https://i.imgur.com/tGbaZCY.jpg");

        image_adpter img_adpter=new image_adpter(this,url_string);
        ListView listView=(ListView)findViewById(R.id.gallery_list);
        listView.setAdapter(img_adpter);


    }
}
