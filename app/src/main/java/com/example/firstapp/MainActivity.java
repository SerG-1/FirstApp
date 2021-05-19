package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView text;
    private Switch switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        text =findViewById(R.id.text);
        switch1 =findViewById(R.id.switch1);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        button.setVisibility(View.GONE);
        text.setText("WELCOME TO MYAPP!");
        text.setTextSize(16);
        switch1.setVisibility(View.VISIBLE);


    }
}