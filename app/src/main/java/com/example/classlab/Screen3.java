package com.example.classlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Screen3);

        TextView nameTV = this.findViewById(R.id.nameTV);
        Intent myIntent = this.getIntent();
        String name = myIntent.getStringExtra("name");
        nameTV.setText(Singleton.name + ": " + Singleton.counter);
