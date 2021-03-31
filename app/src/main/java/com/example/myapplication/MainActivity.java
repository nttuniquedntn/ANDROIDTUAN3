package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
        LinearLayout txtchonmau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect();
        txtchonmau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              switchactivity();
            }
        });
    }
    private void switchactivity(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void connect(){
       txtchonmau = (LinearLayout) findViewById(R.id.chonmau);
    }

}