package com.timewaste.juassignmenttvshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView msgTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        msgTextView = (TextView) findViewById(R.id.textview);
        Intent intent = getIntent();
        String shows = intent.getStringExtra("showList");
        msgTextView.setText(shows);
    }

}
