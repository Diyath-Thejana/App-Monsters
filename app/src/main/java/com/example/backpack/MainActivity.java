package com.example.backpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button8 =(Button) findViewById(R.id.button8);
        Button  button =(Button) findViewById(R.id.button);
        Button  button6 =(Button) findViewById(R.id.button6);
        Button  button14 =(Button) findViewById(R.id.button14);
        button8.setOnClickListener(this);
        button.setOnClickListener(this);
        button6.setOnClickListener(this);
        button14.setOnClickListener(this);
        };

    @Override
    public void onClick(View view) {
    switch(view.getId()){
        case R.id.button8:
            openOneDayList();
            break;
        case R.id.button:
            createOneDay();
            break;
        case R.id.button6:
            addHotel();
            break;
        case R.id.button14:
          welcome();
            break;
    }

    }

    private void createOneDay() {
        Intent intent  = new Intent(this, createonepack.class);
        startActivity(intent);
    };

    public void openOneDayList(){
        Intent intent  = new Intent(this, onedaylist.class);
        startActivity(intent);
    };
    public void addHotel(){
        Intent intent  = new Intent(this, addhotel.class);
        startActivity(intent);
    };
    public void welcome(){
        Intent intent  = new Intent(this, welcome.class);
        startActivity(intent);
    };

}