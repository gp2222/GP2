package com.example.ali.leadershipsupportsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class Edit_Equipment extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__equipment);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("تعديل المعدات");
        setSupportActionBar(toolbar);
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}
