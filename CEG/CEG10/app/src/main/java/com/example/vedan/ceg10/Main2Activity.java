package com.example.vedan.ceg10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private GridviewAdapter mAdapter;
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listCountry, listFlag);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                //Toast.makeText(MainActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                if(position==2){
                    Intent i = new Intent(Main2Activity.this, ignou.class);
                    startActivity(i);


                }
                if(position==0){
                    Intent i2;
                    i2=new Intent(Main2Activity.this,course_list.class);
                    startActivity(i2);
                    ///Intent intent = new Intent(Intent.ACTION_VIEW);
                    ///intent.setData(Uri.parse("http://www.ceg.rajasthan.gov.in"));
                    ///startActivity(intent);

                }
                if(position==1){
                    Intent i4;
                    i4=new Intent(Main2Activity.this,placement.class);
                    startActivity(i4);
                }

                if(position==3){
                    Intent i3;
                    i3=new Intent(Main2Activity.this,skill.class);
                    startActivity(i3);

                }
            }
        });




        /////////////////////////////////////////////////
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void prepareList() {

       listCountry = new ArrayList<String>();

        listCountry.add("IT & Software Traning ");
        listCountry.add("Centralised Placement Cell");
        listCountry.add("IGNOU");
        listCountry.add("Skill Development");



        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.it);
        listFlag.add(R.drawable.placement);
        listFlag.add(R.drawable.ignou1);
        listFlag.add(R.drawable.skill);




    }

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
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // developed and designed by Vedant Sethia
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_maps) {
            Intent i = new Intent(Main2Activity.this, MapsActivity.class);
            startActivity(i);
        }
        if (id == R.id.nav_share) {

            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText = "Hello from CEG.. \n\n https://drive.google.com/open?id=0B5fnb2P6jFfsbnlDQnJ4NUw0cWgwTHNUa0djYkswMEtwbkVZ";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Share");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
            return true;
        }
        if  (id == R.id.nav_contactus) {

            Intent i = new Intent(Main2Activity.this, contact.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent i;
        if (id == R.id.nav_queries) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("http://www.cegrajasthan.in"));
            startActivity(intent1);



        } else if (id == R.id.nav_gallery) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("http://www.cegrajasthan.in"));
            startActivity(intent1);



        } else if (id == R.id.nav_home) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("http://www.cegrajasthan.in"));
            startActivity(intent1);




        } else if (id == R.id.nav_latest_update) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("http://www.cegrajasthan.in"));
            startActivity(intent1);



        } else if (id == R.id.nav_traing_programs) {
            i = new Intent(Main2Activity.this, course_list.class);
            startActivity(i);



        } else if (id == R.id.nav_registration) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("http://cegrajasthan.org/SummerTrainingRegistrationPayment.aspx"));
            startActivity(intent1);


        } else if (id == R.id.nav_ignou) {
            i = new Intent(Main2Activity.this, ignou.class);
            startActivity(i);


        } else if (id == R.id.nav_patrons) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("http://www.cegrajasthan.in"));
            startActivity(intent1);
        } else if (id == R.id.nav_placement) {

            Intent i4;
            i4=new Intent(Main2Activity.this,placement.class);
            startActivity(i4);



        } else if (id == R.id.nav_skill_development_centre) {
            i = new Intent(Main2Activity.this, skill.class);
            startActivity(i);



        } else if (id == R.id.nav_about_us) {
            /*setContentView(R.layout.activity_about);*/
            i = new Intent(Main2Activity.this, about.class);
            startActivity(i);


        }else if (id == R.id.nav_faculty_programs) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("http://www.cegrajasthan.in"));
            startActivity(intent1);


        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;




    }

}



