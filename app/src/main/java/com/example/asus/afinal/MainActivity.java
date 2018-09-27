package com.example.asus.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Pindah activity ke Fragment activity
    public void Masuk(View view) {
        Intent intent = new Intent(MainActivity.this, Fragment.class);
        startActivity(intent);
    }
}
