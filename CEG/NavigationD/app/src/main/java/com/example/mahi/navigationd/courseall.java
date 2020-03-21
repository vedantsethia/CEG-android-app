package com.example.mahi.navigationd;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;


public class courseall extends AppCompatActivity {

    course course1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courseall);
        //getSupportActionBar().show();

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ///////////////////////////////////////////
        //first horizontal view
        final course_list courses=new course_list();
        int i=0;
        LinearLayout hsv_linear_layout4=(LinearLayout)findViewById(R.id.course1);
        //course_list courses1=new course_list();
        for( i=0;i<5;i++)
        {

            RelativeLayout course_layout=(RelativeLayout) View.inflate(courseall.this,R.layout.course,null);
            LinearLayout gap=(LinearLayout) View.inflate(courseall.this,R.layout.gap,null);
            ImageView img=course_layout.findViewById(R.id.img_course);
            TextView c_n=course_layout.findViewById(R.id.course_name);
            final int index=i;
            course1=courses.getcourse(i);
            int id1=course1.getImageid();//course_list.get(i).getImageid();
           // String course_name1=course1.getCourse_name();//course_list.get(i).getCourse_name();
            //img.setBackgroundResource(id1);
           // String imageUri="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbW-Tl-gsY2l-0UQWq_e7cHN-TGoQn5iht49jzXxsXX5g0PC7A";
           // String imageUri = "https://i.imgur.com/tGbaZCY.jpg";
            Picasso.with(this).load(course1.getUri()).fit().into(img);






           // c_n.setText(course_name1);
            course_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(courseall.this,course_detail.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    i.putExtra("img_uri",courses.getcourse(index).getUri());
                    i.putExtra("id1",courses.getcourse(index).getPrere_id());
                    i.putExtra("about",courses.getcourse(index).getAbout_id());
                    i.putExtra("des",courses.getcourse(index).getDes_id());
                    i.putExtra("inc",courses.getcourse(index).getInc_id());
                    i.putExtra("what",courses.getcourse(index).getWhat_id());
                    startActivity(i);

                }
            });
            hsv_linear_layout4.addView(course_layout);
            hsv_linear_layout4.addView(gap);

        }


        LinearLayout hsv_linear_layout=(LinearLayout)findViewById(R.id.course2);

        for( i=5;i<10;i++)
        {
            RelativeLayout course_layout=(RelativeLayout) View.inflate(courseall.this,R.layout.course,null);
            LinearLayout gap=(LinearLayout) View.inflate(courseall.this,R.layout.gap,null);
            ImageView img=course_layout.findViewById(R.id.img_course);
            TextView c_n=course_layout.findViewById(R.id.course_name);
            course1=courses.getcourse(i);
            //int id1=courses.getcourse(i).getImageid();//course_list.get(i).getImageid();
           // String course_name1=courses.getcourse(i).getCourse_name();//course_list.get(i).getCourse_name();

            //img.setBackgroundResource(id1);
            String imageUri = courses.getcourse(i).getUri();//"https://i.imgur.com/tGbaZCY.jpg";
            Picasso.with(this).load(imageUri).fit().centerCrop().into(img);
            int id1=courses.getcourse(i).getPrere_id();
            final int index=i;

            //c_n.setText(course_name1);
            course_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent i=new Intent(courseall.this,course_detail.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                   // i.putExtra("id",);
                    i.putExtra("img_uri",courses.getcourse(index).getUri());
                    i.putExtra("id1",courses.getcourse(index).getPrere_id());
                    i.putExtra("about",courses.getcourse(index).getAbout_id());
                    i.putExtra("des",courses.getcourse(index).getDes_id());
                    i.putExtra("inc",courses.getcourse(index).getInc_id());
                    i.putExtra("what",courses.getcourse(index).getWhat_id());
                    startActivity(i);

                }
            });
            hsv_linear_layout.addView(course_layout);
            hsv_linear_layout.addView(gap);

        }

        LinearLayout hsv_linear_layout1=(LinearLayout)findViewById(R.id.course3);
        //course_list courses1=new course_list();
        i=0;
        for( i=10;i<15;i++)
        {
            RelativeLayout course_layout=(RelativeLayout) View.inflate(courseall.this,R.layout.course,null);
            ImageView img=course_layout.findViewById(R.id.img_course);
            TextView c_n=course_layout.findViewById(R.id.course_name);
            course1=courses.getcourse(i);
            int id1=courses.getcourse(i).getImageid();//course_list.get(i).getImageid();
           // String course_name1=courses.getcourse(i).getCourse_name();//course_list.get(i).getCourse_name();

            //img.setBackgroundResource(id1);
            String imageUri = courses.getcourse(i).getUri();//"https://i.imgur.com/tGbaZCY.jpg";
            Picasso.with(this).load(imageUri).fit().centerCrop().networkPolicy(NetworkPolicy.OFFLINE).into(img);
           // int id1=courses.getcourse(i).getPrere_id();
            final int index=i;
           // c_n.setText(course_name1);
            course_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(courseall.this,course_detail.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    i.putExtra("img_uri",courses.getcourse(index).getUri());
                    i.putExtra("id1",courses.getcourse(index).getPrere_id());
                    i.putExtra("about",courses.getcourse(index).getAbout_id());
                    i.putExtra("des",courses.getcourse(index).getDes_id());
                    i.putExtra("inc",courses.getcourse(index).getInc_id());
                    i.putExtra("what",courses.getcourse(index).getWhat_id());
                    startActivity(i);

                }
            });
            hsv_linear_layout1.addView(course_layout);

        }

        LinearLayout hsv_linear_layout2=(LinearLayout)findViewById(R.id.course4);
        //course_list courses1=new course_list();
        i=0;
        for( i=15;i<20;i++)
        {
            RelativeLayout course_layout=(RelativeLayout) View.inflate(courseall.this,R.layout.course,null);
            ImageView img=course_layout.findViewById(R.id.img_course);
            TextView c_n=course_layout.findViewById(R.id.course_name);
            course1=courses.getcourse(i);
            int id1=courses.getcourse(i).getImageid();//course_list.get(i).getImageid();
            //String course_name1=courses.getcourse(i).getCourse_name();//course_list.get(i).getCourse_name();

            //img.setBackgroundResource(id1);
            String imageUri = courses.getcourse(i).getUri();//"https://i.imgur.com/tGbaZCY.jpg";
            Picasso.with(this).load(imageUri).fit().networkPolicy(NetworkPolicy.OFFLINE).into(img);
            // int id1=courses.getcourse(i).getPrere_id();
            final int index=i;
           // c_n.setText(course_name1);
            course_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(courseall.this,course_detail.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    i.putExtra("img_uri",courses.getcourse(index).getUri());
                    i.putExtra("id1",courses.getcourse(index).getPrere_id());
                    i.putExtra("about",courses.getcourse(index).getAbout_id());
                    i.putExtra("des",courses.getcourse(index).getDes_id());
                    i.putExtra("inc",courses.getcourse(index).getInc_id());
                    i.putExtra("what",courses.getcourse(index).getWhat_id());
                    startActivity(i);

                }
            });
            hsv_linear_layout2.addView(course_layout);

        }


        LinearLayout hsv_linear_layout3=(LinearLayout)findViewById(R.id.course5);
        //course_list courses1=new course_list();
        i=0;
        for( i=20;i<25;i++)
        {
            RelativeLayout course_layout=(RelativeLayout) View.inflate(courseall.this,R.layout.course,null);
            ImageView img=course_layout.findViewById(R.id.img_course);
            TextView c_n=course_layout.findViewById(R.id.course_name);
            course1=courses.getcourse(i);
            int id1=courses.getcourse(i).getImageid();//course_list.get(i).getImageid();
           // String course_name1=courses.getcourse(i).getCourse_name();//course_list.get(i).getCourse_name();

            //img.setBackgroundResource(id1);
            String imageUri = courses.getcourse(i).getUri();//"https://i.imgur.com/tGbaZCY.jpg";
            Picasso.with(this).load(imageUri).fit().centerCrop().networkPolicy(NetworkPolicy.OFFLINE).into(img);
            // int id1=courses.getcourse(i).getPrere_id();
            final int index=i;
            //c_n.setText(course_name1);
            course_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(courseall.this,course_detail.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
                    i.putExtra("img_uri",courses.getcourse(index).getUri());
                    i.putExtra("id1",courses.getcourse(index).getPrere_id());
                    i.putExtra("about",courses.getcourse(index).getAbout_id());
                    i.putExtra("des",courses.getcourse(index).getDes_id());
                    i.putExtra("inc",courses.getcourse(index).getInc_id());
                    i.putExtra("what",courses.getcourse(index).getWhat_id());
                    startActivity(i);

                }
            });
            hsv_linear_layout3.addView(course_layout);

        }



    }




}
