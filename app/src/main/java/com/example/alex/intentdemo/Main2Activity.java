package com.example.alex.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.alex.intentdemo.utils.Utils.AGE_MSG_KEY;

public class Main2Activity extends AppCompatActivity {

    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1=(TextView)findViewById(R.id.tv1_ma2);

        String incomingMsg =getIntent().getStringExtra(AGE_MSG_KEY);
        textView1.setText(incomingMsg);
    }
}
