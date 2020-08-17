package com.example.backpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class search extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ImageButton imageButton2 =(ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(( this));
    };
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.imageButton2:
                contentDisplay();
                break;
        }
    }
    private void contentDisplay() {
        Intent intent  = new Intent(this, content.class);
        startActivity(intent);
    };
}