package com.example.ali.leadershipsupportsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
        ;

public class add_meeting extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Main2Activity);
        toolbar=(Toolbar)findViewById(R.id.toolbarr);
        toolbar.setTitle("إضافة اجتماع");
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_main2);}

        public boolean onCreatOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
        }
    }


