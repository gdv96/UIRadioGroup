package com.unisannio.gdevanno.uiradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class RadioGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        final TextView tv = (TextView) findViewById(R.id.textView);

        //Define a generic listener for all three RadioButtons in the RadioGroup
        final View.OnClickListener radioListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton rb = (RadioButton) view;
                tv.setText(rb.getText() + " chosen");
            }
        };

        final RadioButton choice1 = (RadioButton) findViewById(R.id.choice1);
        //Called when RadioButton choice1 is clicked
        choice1.setOnClickListener(radioListener);

        final RadioButton choice2 = (RadioButton) findViewById(R.id.choice2);
        //Called when RadioButton choice2 is clicked
        choice2.setOnClickListener(radioListener);

        final RadioButton choice3 = (RadioButton) findViewById(R.id.choice3);
        //Called when RadioButton choice3 is clicked
        choice3.setOnClickListener(radioListener);

    }
}