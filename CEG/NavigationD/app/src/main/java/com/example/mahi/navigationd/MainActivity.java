package com.example.mahi.navigationd;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

        course course1;

       private ViewPager viewPager;
       private int[] image={R.layout.home,R.layout.admissions,R.layout.ignou,R.layout.training,R.layout.registration};
       private imagePager imgPager;
       private LinearLayout Dots_Layout;
       private ImageView[] dots;
    private LinearLayout slider;
    private LayoutInflater inflater;
    //private courseall;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        viewPager=(ViewPager)findViewById(R.id.v_Pager);
        viewPager.setAdapter(new imagePager(image,this));

        //Timer timer=new Timer();
        //timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);

//for dots after private  ImageView[] dots;
        Dots_Layout = (LinearLayout)findViewById(R.id.dot_layout);



        createDots(0);

        ///////////////////////////////////////////

        //Horizontal Scroll View For Courses

        // HorizontalScrollView hsv=(HorizontalScrollView)findViewById(R.id.Hot_topic);



        // RelativeLayout course_layout=(RelativeLayout)findViewById(R.id.course);

        // LayoutInflater Inflater=LayoutInflater.from(this);


       /* ArrayList<course> course_list=new ArrayList<>();
        String course_name[]={"Java","Python","Sql","hadoop","Machine Learning"};
        int []id={R.drawable.java,R.drawable.python,R.drawable.sql,R.drawable.hadoop,R.drawable.ml1};

        for(int j=0;j<course_name.length;j++ ){
            course_list.add(new course(course_name[j], id[j]));

        }*/




        ///row.addView(featureLayout);
        LinearLayout hsv_linear_layout=(LinearLayout)findViewById(R.id.topic);
        final course_list courses=new course_list();
        int i=0;
        for( i=0;i<5;i++)
        {
            RelativeLayout course_layout=(RelativeLayout) View.inflate(MainActivity.this,R.layout.course,null);
            //course_layout.setElevation();
            ImageView img=course_layout.findViewById(R.id.img_course);
            TextView c_n=course_layout.findViewById(R.id.course_name);

            course1=courses.getcourse(i);
            int id1=courses.getcourse(i).getImageid();//course_list.get(i).getImageid();
            //String course_name1=courses.getcourse(i).getCourse_name();//course_list.get(i).getCourse_name();

            //img.setBackgroundResource(id1);
            Picasso.with(this).load(course1.getUri()).fit().centerCrop().into(img);
            float v = 1.0f;
            img.setElevation(v);
            final int index=i;
            //c_n.setText(course_name1);
            course_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(MainActivity.this,course_detail.class);
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
            hsv_linear_layout.addView(course_layout);

        }
        RelativeLayout course_layout=(RelativeLayout) View.inflate(MainActivity.this,R.layout.course,null);
        ImageView img=course_layout.findViewById(R.id.img_course);
        img.setBackgroundResource(R.drawable.shape);

        //img.setEnabled(false);
        TextView c_n=course_layout.findViewById(R.id.course_name);
        c_n.setText("View All");
        c_n.setTextColor(this.getResources().getColor(R.color.Black));

        hsv_linear_layout.addView(course_layout);
        c_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,courseall.class);
                startActivity(i);
            }
        });



        //LinearLayout view_all= (LinearLayout) findViewById(R.id.course_all_layout);
        //course_viewall cw=new course_viewall();

        ///partner of ceg like RED_HAT,MICROSOFT

        LinearLayout hsv_linear_layout_p=(LinearLayout)findViewById(R.id.partner);
        final partner_list partner=new partner_list();
        // i=0;
        for( i=0;i<5;i++)
        {
            RelativeLayout partner_layout=(RelativeLayout) View.inflate(MainActivity.this,R.layout.course,null);
            //course_layout.setElevation();
            ImageView img_p=partner_layout.findViewById(R.id.img_course);
            //TextView c_n=course_layout.findViewById(R.id.course_name);

            //course1=partner.getpartner(i);
            //int id1=courses.getcourse(i).getImageid();//course_list.get(i).getImageid();
            //String course_name1=courses.getcourse(i).getCourse_name();//course_list.get(i).getCourse_name();

            //img.setBackgroundResource(id1);
            Picasso.with(this).load(partner.getpartner(i).getImg_uri()).fit().networkPolicy(NetworkPolicy.OFFLINE).into(img_p);
            float v = 1.0f;
            img.setElevation(v);
            final int index=i;

            //c_n.setText(course_name1);
            partner_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(MainActivity.this,course_detail.class);
                    //Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();

                    i.putExtra("img_uri",partner.getpartner(index).getImg_uri());
                    i.putExtra("id1",partner.getpartner(index).getText_id());
                    startActivity(i);

                }
            });
            hsv_linear_layout_p.addView(partner_layout);

        }



        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position)
            {
                createDots(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        // home page pic slide bar

      //  inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View slider = (View) inflater.inflate(R.layout.ignou, null);


    }

    private void createDots(int curr_position) {
        if (Dots_Layout != null)
            Dots_Layout.removeAllViews();
        dots = new ImageView[image.length];

        for (int i = 0; i < image.length; ++i) {
            dots[i] = new ImageView(this);
            if (i == curr_position) {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dots_active));
            } else
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dots_default));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(2, 0, 2, 0);
            Dots_Layout.addView(dots[i], params);
        }
    }








    //////////////////////////////////////////

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent i;
        if (id == R.id.nav_home) {
            i=new Intent(MainActivity.this,MainActivity.class);
            startActivity(i);
            // Handle the camera action
        } else if (id == R.id.nav_latest_update) {
            i=new Intent(MainActivity.this,ignou_activity.class);
            i.putExtra("url","www.mnit.ac.in");

            startActivity(i);

        } else if (id == R.id.nav_courses) {
            i=new Intent(MainActivity.this,courseall.class);
            startActivity(i);

        } else if (id == R.id.nav_registration) {

            i=new Intent(MainActivity.this,ignou_activity.class);
            i.putExtra("url","mnit.ac.in");
            startActivity(i);

        } else if (id == R.id.nav_ignou) {
            i=new Intent(MainActivity.this,ignou_activity.class);
            i.putExtra("url","mnit.ac.in");
            startActivity(i);

        } else if (id == R.id.nav_traing_programs) {
            i=new Intent(MainActivity.this,courseall.class);
            startActivity(i);

        }else if (id == R.id.nav_skill_development_centre) {


        }else if (id == R.id.nav_maps) {


        }else if (id == R.id.nav_gallery) {
            i=new Intent(MainActivity.this,gallary.class);
            startActivity(i);

        }else if (id == R.id.nav_about_us) {

        }
        else if (id == R.id.nav_queries) {

        }
        else if (id == R.id.nav_share) {


        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public class MyTimerTask extends TimerTask{
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    viewPager.setCurrentItem((viewPager.getCurrentItem()+1)%5);
                }
            });
        }
    }
}
