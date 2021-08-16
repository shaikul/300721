package com.example.a300721;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container1,new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container2,new SecondFragment()).commit();
    }
}