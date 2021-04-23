package com.example.classlab;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    public String input;
    public int number;
    public Object Scanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner = new Scanner(input);
        Scanner = new Scanner(String.valueOf(number));
    }

    public void onNextScreenButtonClicked(View v)
    {
     Intent i = new Intent(this, Screen2.class);
        String keyIdentifer  = null;
        i.putExtra(strName, keyIdentifer );

     this.startActivity(i);
    }


}