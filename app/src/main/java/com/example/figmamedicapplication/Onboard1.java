package com.example.figmamedicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboard1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard1);
    }
    public void startNewActivity(View v) {
        Intent intent = new Intent(this, Onboard2.class);
        startActivity(intent);
}
}