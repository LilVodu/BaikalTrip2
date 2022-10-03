package com.example.baikaltrip2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start4 extends AppCompatActivity {
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start4);
        intent2 = new Intent(this, MainActivity.class);
        Button button = findViewById(R.id.button);
        Intent intent;
        intent = new Intent(this,start5.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);

            }
        });
    }
    public void onClick(View view) {
        startActivity(intent2);
    }
}