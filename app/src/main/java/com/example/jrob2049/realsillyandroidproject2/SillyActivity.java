package com.example.jrob2049.realsillyandroidproject2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.view.View;

public class SillyActivity extends AppCompatActivity {

    private Button SillyButton;
    private TextView SillyText;
    private RelativeLayout SillyLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silly);

        SillyLayout = (RelativeLayout) findViewById(R.id.SillyLayout);
        SillyText = (TextView) findViewById(R.id.SillyTextView);
        SillyButton = (Button) findViewById(R.id.SillyButton);

        setupListeners();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_silly, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    private void changeBackgroundColor()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        SillyLayout.setBackgroundColor(Color.rgb(redColor,greenColor,blueColor));

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        SillyButton.setBackgroundColor(Color.rgb(redColor,blueColor,greenColor));

    }

    private void setupListeners()
    {
        SillyButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                //this is where the action happens!
                changeBackgroundColor();
            }
        });
    }



}
