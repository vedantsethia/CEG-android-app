package com.example.vedan.ceg10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ignou extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ignou);

        Button rsldcweb = (Button) findViewById(R.id.ignouadm);
        Button rsldcapp = (Button) findViewById(R.id.ignouenq);


        rsldcweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.ignou.ac.in"));
                startActivity(intent1);
            }
        });


        rsldcapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://rcjaipur.ignou.ac.in/"));
                startActivity(intent);
            }

        });

    }
}
