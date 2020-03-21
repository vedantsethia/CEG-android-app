package com.example.vedan.ceg10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);


        Button nav_maps1 = (Button)findViewById(R.id.nav_maps1);

        nav_maps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(contact.this, MapsActivity.class);
                startActivity(i);
            }
        });
    }
}
