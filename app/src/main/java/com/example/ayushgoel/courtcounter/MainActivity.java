package com.example.ayushgoel.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int bs=0,as=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bp3(View view){
        bs=bs+3;
        update();
    }

    public void bp2(View view){
        bs+=2;
        update();
    }

    public void bp1(View view){
        bs+=1;
        update();
    }

    public void ap3(View view){
        as=as+3;
        update();
    }

    public void ap2(View view){
        as+=2;
        update();
    }

    public void ap1(View view){
        as+=1;
        update();
    }

    public void update(){
        TextView bscore = (TextView) findViewById(R.id.bs);
        bscore.setText(""+bs);

        TextView ascore = (TextView) findViewById(R.id.as);
        ascore.setText(""+as);



    }
}
