package com.ge20070469.ui_without_xml;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout constraintLayout = findViewById(R.id.mainLayout);

        LinearLayout topGray = new LinearLayout(this);
        LinearLayout bottomBlue = new LinearLayout(this);
        EditText left = new EditText(this);
        EditText right = new EditText(this);
        Button buttonRedLeft = new Button(this);
        Button buttonBlueRight = new Button(this);

        left.setText("LeftText");
        right.setText("RightText");
        left.setBackgroundColor(Color.WHITE);
        right.setBackgroundColor(Color.WHITE);


        buttonRedLeft.setText("buttonRed");
        buttonRedLeft.setTextColor(Color.RED);
        buttonBlueRight.setText("buttonBlue");
        buttonBlueRight.setTextColor(Color.BLUE);

        topGray.setBackgroundColor(Color.GRAY);
        bottomBlue.setBackgroundColor(Color.BLUE);

        topGray.setOrientation(LinearLayout.HORIZONTAL);
        bottomBlue.setOrientation(LinearLayout.HORIZONTAL);

        topGray.addView(left);
        topGray.addView(right);

        bottomBlue.addView(buttonRedLeft);
        bottomBlue.addView(buttonBlueRight);




        buttonRedLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I am left button", Toast.LENGTH_SHORT);
            }
        });

        buttonBlueRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I am right button", Toast.LENGTH_SHORT);

            }
        });

        constraintLayout.addView(topGray);
        constraintLayout.addView(bottomBlue);




    }
}
