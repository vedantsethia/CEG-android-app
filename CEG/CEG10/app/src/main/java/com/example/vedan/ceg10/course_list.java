package com.example.vedan.ceg10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class course_list extends AppCompatActivity{
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;;
    private ArrayList<String> listFlag1;
     ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);




/*
        TextView moreCourses = (TextView)findViewById(R.id.moreCourses);
        moreCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.cegrajasthan.in"));
                startActivity(intent1);
            }
        });

*/

        prepareList();
        listView = (ListView)findViewById(R.id.list_view);
        // prepared arraylist and passed it to the Adapter class
        ListviewAdapter lAdapter = new ListviewAdapter(this,listCountry, listFlag,listFlag1);

        // Set custom adapter to gridview

        listView.setAdapter(lAdapter);

        // Implement On Item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                //Toast.makeText(MainActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                if(position==1){
                    setContentView(R.layout.activity_course_detail);
                }
                if(position==0){
                    setContentView(R.layout.activity_iot);

                }
                if(position==2){
                    setContentView(R.layout.activity_bigdata);
                }
                if(position==3){
                    setContentView(R.layout.activity_python);
                }
                if(position==4){
                    setContentView(R.layout.activity_asp);
                }
                if(position==5){
                    setContentView(R.layout.activity_centos);
                    /*
                    Intent i1 = new Intent(course_list.this,Main2Activity.class);
                    startActivity(i1);
                */
                }
                if(position==6){
                    setContentView(R.layout.activity_cisco);
                }
                if(position==7){
                    setContentView(R.layout.activity_cc);
                }if(position==8){
                    setContentView(R.layout.activity_android);
                }
            }
        });

    }

    public void prepareList()
    {
        listCountry = new ArrayList<String>();

        listCountry.add("Internet of Things");
        listCountry.add("Machine Learning");
        listCountry.add("BigData and Hadoop");
        listCountry.add("Python Programming");
        listCountry.add("Microsoft ASP.net MVC5 using RAZOR ");
        listCountry.add("System Administration using CentOS");
        listCountry.add("CISCO-CCNA");
        listCountry.add("Cloud Computing-IAAS");
        listCountry.add("Android App Development");
        listCountry.add("More Courses");


        listFlag1 = new ArrayList<String>();

        listFlag1.add("30 days");
        listFlag1.add("30 days");
        listFlag1.add("60 daya");
        listFlag1.add("60 days");
        listFlag1.add("60 days");
        listFlag1.add("60 days");
        listFlag1.add("60 days");
        listFlag1.add("30 days");
        listFlag1.add("60 days");
        listFlag1.add("Click here");




        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.iot_square);
        listFlag.add(R.drawable.ml_square);
        listFlag.add(R.drawable.bg_square);
        listFlag.add(R.drawable.python_square);
        listFlag.add(R.drawable.asp_sqaure);
        listFlag.add(R.drawable.centos_square);
        listFlag.add(R.drawable.images3);
        listFlag.add(R.drawable.cc_square);
        listFlag.add(R.drawable.android_square);




    }
}
