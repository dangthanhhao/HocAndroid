package com.aszqsc.layoutandwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnClick(View view) {
        Intent myIntent=new Intent(getBaseContext(), Homework1.class);
        startActivity(myIntent);
    }

    public void ToWidgetActi(View view) {
        Intent myIntent=new Intent(getBaseContext(),LearnWidget.class);
        startActivity(myIntent);
    }

    public void GotoListView(View view) {
        Intent myIntent=new Intent(getBaseContext(),LearnListView.class);
        startActivity(myIntent);
    }
}
