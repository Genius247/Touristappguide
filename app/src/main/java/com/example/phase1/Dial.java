package com.example.phase1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Dial extends AppCompatActivity {
    public static final int REQUEST_CALL=1;
    Button b1;
    Button b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        b1= (Button) findViewById(R.id.call1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:100"));
                if(ContextCompat.checkSelfPermission(Dial.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(Dial.this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                }else {
                    startActivity(callIntent);
                }
            }
        });
        b2= (Button) findViewById(R.id.call2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:101"));
                if(ContextCompat.checkSelfPermission(Dial.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(Dial.this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                }else {
                    startActivity(callIntent);
                }
            }
        });
        b3= (Button) findViewById(R.id.call3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:102"));
                if(ContextCompat.checkSelfPermission(Dial.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(Dial.this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                }else {
                    startActivity(callIntent);
                }
            }
        });
    }
}
