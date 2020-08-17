package com.example.backpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onedaylist extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onedaylist);

        Button button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

    };
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button3:
                viewOneDayList();
                break;

        }

    }
    private void viewOneDayList() {
        Intent intent  = new Intent(this, updateoneday.class);
        startActivity(intent);
    };
}