package com.example.showandhide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // widgets
    private TextView tvHello;

    // methods
    public void onClickHide(View view) {
        tvHello.setVisibility(View.INVISIBLE);
    }

    public void onClickShow(View view) {
        tvHello.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tvHello);
    }
}