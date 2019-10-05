package com.example.hw1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
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
        for (int i=1; i <= 11; i++){
            TextView tv = new TextView(this);
            tv.setLayoutParams(tvParams);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv.setText("" + i);
            lv.addView(tv);
            tv.setBackgroundColor(Color.GRAY);
        }

        // This is for row 6 of the table
        lv = (LinearLayout) findViewById(R.id.row6linearLayout);


        TextView tView= new TextView(this);
        LinearLayout.LayoutParams textParam = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        textParam.weight = 1;
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("            ");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

        textParam.weight = .5f;
        tView= new TextView(this);
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("int min");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

        textParam.weight = .5f;
        tView= new TextView(this);
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("   int max");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

        textParam.weight = 1;
        tView= new TextView(this);
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("String greeting");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

    }
}
