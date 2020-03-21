package com.example.mahi.navigationd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class course_detail extends AppCompatActivity {
    TextView courseDetailsTextView1;
    TextView courseDetailsTextView2;
    TextView courseDetailsTextView3;
    TextView courseDetailsTextView4;
    TextView courseDetailsTextView5;
    Button ShowmoreButton1;
    Button ShowmoreButton2;
    Button ShowmoreButton3;
    Button ShowmoreButton4;
    Button ShowmoreButton5;
    Button register_button;
    Button fullSyllabusButton;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i=getIntent();
        String img_uri=i.getStringExtra("img_uri");

        int id=i.getIntExtra("id1",0);
        int about=i.getIntExtra("about",0);
        int inc=i.getIntExtra("inc",0);
        int des=i.getIntExtra("des",0);
        int what=i.getIntExtra("what",0);

        myToolbar.setTitle(R.string.title_activity_home);

        courseDetailsTextView1=(TextView)findViewById(R.id.courseDetailsTextView1);
        courseDetailsTextView2=(TextView)findViewById(R.id.courseDetailsTextView2);
        courseDetailsTextView3=(TextView)findViewById(R.id.courseDetailsTextView3);
        courseDetailsTextView4=(TextView)findViewById(R.id.courseDetailsTextView4);
        courseDetailsTextView5=(TextView)findViewById(R.id.courseDetailsTextView5);
        ShowmoreButton1=(Button)findViewById(R.id.ShowmoreButton1);
        ShowmoreButton2=(Button)findViewById(R.id.ShowmoreButton2);
        ShowmoreButton3=(Button)findViewById(R.id.ShowmoreButton3);
        ShowmoreButton4=(Button)findViewById(R.id.ShowmoreButton4);
        ShowmoreButton5=(Button)findViewById(R.id.ShowmoreButton5);
        register_button=(Button)findViewById(R.id.register_buttonId);
        fullSyllabusButton=(Button)findViewById(R.id.fullSyllabusButton);
        img=(ImageView)findViewById(R.id.course_img);
        Picasso.with(this).load(img_uri).fit().centerCrop().into(img);
        courseDetailsTextView1.setText(id);
        courseDetailsTextView2.setText(about);
        courseDetailsTextView3.setText(inc);
        courseDetailsTextView4.setText(des);
        courseDetailsTextView5.setText(what);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://cegrajasthan.org/SummerTrainingRegistrationPayment.aspx";
                Intent register_intent=new Intent(course_detail.this,ignou_activity.class);
                register_intent.putExtra("url", url);
                startActivity(register_intent);
            }
        });
        fullSyllabusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://drive.google.com/file/d/17b89H7Qk_8kQY7CmkQJ-2QqT0KdTZrTj/view?usp=sharing";
                Intent syllabus_intent=new Intent(course_detail.this,ignou_activity.class);
                syllabus_intent.putExtra("url",url);
                startActivity(syllabus_intent);
            }
        });
        ShowmoreButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ShowmoreButton1.getText().toString().equalsIgnoreCase("Show more..."))
                {
                    courseDetailsTextView1.setMaxLines(Integer.MAX_VALUE);//your TextView
                    ShowmoreButton1.setText("Show less");
                }
                else
                {
                    courseDetailsTextView1.setMaxLines(3);//your TextView
                    ShowmoreButton1.setText("Show more...");
                }
            }
        });
        ShowmoreButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ShowmoreButton2.getText().toString().equalsIgnoreCase("Show more..."))
                {
                    courseDetailsTextView2.setMaxLines(Integer.MAX_VALUE);//your TextView
                    ShowmoreButton2.setText("Show less");
                }
                else
                {
                    courseDetailsTextView2.setMaxLines(3);//your TextView
                    ShowmoreButton2.setText("Show more...");
                }
            }
        });
        ShowmoreButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ShowmoreButton3.getText().toString().equalsIgnoreCase("Show more..."))
                {
                    courseDetailsTextView3.setMaxLines(Integer.MAX_VALUE);//your TextView
                    ShowmoreButton3.setText("Show less");
                }
                else
                {
                    courseDetailsTextView3.setMaxLines(3);//your TextView
                    ShowmoreButton3.setText("Show more...");
                }
            }
        });
        ShowmoreButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ShowmoreButton4.getText().toString().equalsIgnoreCase("Show more..."))
                {
                    courseDetailsTextView4.setMaxLines(Integer.MAX_VALUE);//your TextView
                    ShowmoreButton4.setText("Show less");
                }
                else
                {
                    courseDetailsTextView4.setMaxLines(3);//your TextView
                    ShowmoreButton4.setText("Show more...");
                }
            }
        });
        ShowmoreButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ShowmoreButton5.getText().toString().equalsIgnoreCase("Show more..."))
                {
                    courseDetailsTextView5.setMaxLines(Integer.MAX_VALUE);//your TextView
                    ShowmoreButton5.setText("Show less");
                }
                else
                {
                    courseDetailsTextView5.setMaxLines(3);//your TextView
                    ShowmoreButton5.setText("Show more...");
                }
            }
        });
    }
}
