package com.example.hw1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Java_plusXMLActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.linear_root);


        LinearLayout lv = (LinearLayout) findViewById(R.id.numericalCol);

        ViewGroup.LayoutParams tvParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );

        //This is the row of numbers on the left side of the screen
        for (int i = 1; i <= 11; i++){
            TextView tv = new TextView(this);
            tv.setLayoutParams(tvParams);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv.setText("" + i);
            lv.addView(tv);
            tv.setBackgroundColor(Color.GRAY);
        }

        //BEGIN line 4
        lv = (LinearLayout) findViewById(R.id.row4);


        TextView tv = new TextView(this);
        LinearLayout.LayoutParams textParam = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        tv.setText("Rule");
        tv.setPadding(100,0,70,0);
        tv.setTypeface(null, Typeface.BOLD);
        lv.addView(tv, textParam);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setPadding(300,0,200,0);
        tv.setTypeface(null, Typeface.BOLD);
        lv.addView(tv, textParam);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setPadding(300,0,200,0);
        tv.setTypeface(null, Typeface.BOLD);
        lv.addView(tv, textParam);
        //END line 4

        //BEGIN line 6
        lv = (LinearLayout) findViewById(R.id.row6);


        tv = new TextView(this);
        //tv = (TextView) findViewById(R.id.tv61);
        tv.setText("int min");
        tv.setPadding(70,0,70,0);
        lv.addView(tv, textParam);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setPadding(55,0,55,0);
        lv.addView(tv, textParam);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setPadding(200,0,51,0);
        lv.addView(tv, textParam);
    }
}
