package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (TextView) findViewById(R.id.textView);
        t1 = (TextView) findViewById(R.id.textView1);

        Intent page2 = getIntent();
        String t2 = page2.getStringExtra("Sgrade");
        String t3 = page2.getStringExtra("name5");
        t.setText(t3);
        t1.setText(t2);
    }
}
