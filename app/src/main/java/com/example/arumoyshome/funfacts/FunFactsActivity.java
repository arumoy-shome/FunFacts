package com.example.arumoyshome.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    //returns the class name; avoid hard coding class name
    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign them the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                // update the label with our dynamic fact
                factLabel.setText(fact);

                //update background
                int color = mColorWheel.getColor();
                mainLayout.setBackgroundColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);

        //Toast welcomeToast = Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Log.d(TAG, "We are logging from the onCreate() method");
    }
}
