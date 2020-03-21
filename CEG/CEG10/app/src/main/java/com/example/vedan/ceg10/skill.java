package com.example.vedan.ceg10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class skill extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsldc);

        Button rsldcweb = (Button)findViewById(R.id.rsldcweb);
        Button rsldcapp = (Button)findViewById(R.id.rsldcapp);


        rsldcweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://livelihoods.rajasthan.gov.in/content/livelihood/en/skill-department.html"));
                startActivity(intent1);
            }
        });


        rsldcapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ceg.rajasthan.gov.in/attachments/61a228e417RSLDCFORM.docx"));
                startActivity(intent);
            }

        });


    }


}
