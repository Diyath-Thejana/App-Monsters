package com.example.backpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button button16 =(Button) findViewById(R.id.button16);
        button16.setOnClickListener(this);

    };
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button16:
                explorer();
                break;
        }
    }
    private void explorer() {
        Intent intent  = new Intent(this, search.class);
        startActivity(intent);
    };
}