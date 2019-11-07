package com.example.phase1;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class user extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    FirebaseAuth firebaseAuth;
    ViewFlipper viewFlipper;



    private FirebaseAuth.AuthStateListener authStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        int images[]={R.drawable.mumbai,R.drawable.sa,R.drawable.london,R.drawable.italy,R.drawable.newyork};
        viewFlipper=findViewById(R.id.v_flipper);
        //for loop

        for(int image:images)
        {
            flipperImages(image);
        }

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(user.this, "Getting your search ready", Toast.LENGTH_SHORT).show();
                Intent searchIntent = new Intent(user.this, Search.class);
                startActivity(searchIntent);

            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //Toast.makeText(user.this, "Getting your search ready", Toast.LENGTH_SHORT).show();
                Intent MapsIntent1 = new Intent(user.this, MapsActivity.class);
                startActivity(MapsIntent1);

            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //Toast.makeText(user.this, "Getting your search ready", Toast.LENGTH_SHORT).show();
                Intent MapsIntent2 = new Intent(user.this, Maps2.class);
                startActivity(MapsIntent2);

            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(user.this, "Ready to upload and view", Toast.LENGTH_SHORT).show();
                Intent clickIntent = new Intent(user.this, Click.class);
                startActivity(clickIntent);
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(user.this, "Emergency Dialling", Toast.LENGTH_SHORT).show();
                Intent dialIntent = new Intent(user.this, Dial.class);
                startActivity(dialIntent);
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                Intent I = new Intent(user.this, login.class);
                startActivity(I);


            }



        });
    }

    public void flipperImages(int image)
    {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        //animation
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);


    }


}