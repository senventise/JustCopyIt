package com.senventise.justcopyit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        TextView textView = findViewById(R.id.textView);
        if (Intent.ACTION_SEND.equals(action) && type != null){
            String text = intent.getStringExtra(Intent.EXTRA_TEXT);
            if (text != null) {
                textView.setText(text);
            }
        }
    }
}
