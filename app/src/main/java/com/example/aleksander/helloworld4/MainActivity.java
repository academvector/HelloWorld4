package com.example.aleksander.helloworld4;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ConstraintLayout mConstraintLayout;
    private TextView textView;
    private Button mRedButt;
    private Button mYellowButt;
    private Button mGreenButt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.ConLayout);
        textView = findViewById(R.id.textViewColor);
    }

    public void onRedClick(View view) {
        textView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.RedBack));
    }

    public void onGreenClick(View view) {
        textView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.GreenBack));
    }

    public void onYellowClick(View view) {
        textView.setText(R.string.yellow);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.YellowBack));
    }
}
