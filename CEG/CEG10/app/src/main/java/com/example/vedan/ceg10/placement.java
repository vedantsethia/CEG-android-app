package com.example.vedan.ceg10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class placement extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placement);

        Button rsldcweb = (Button) findViewById(R.id.place1);
        Button rsldcapp = (Button) findViewById(R.id.place2);


        rsldcweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.cegrajasthan.org"));
                startActivity(intent1);
            }
        });


        rsldcapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ceg.rajasthan.gov.in"));
                startActivity(intent);
            }

        });

    }
}