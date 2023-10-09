package com.example.figmamedicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard2);
    }
    public void startNewActivity(View v) {
        Intent intent = new Intent(this, Onboard3.class);
        startActivity(intent);
    }
}