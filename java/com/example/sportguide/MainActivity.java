package com.example.sportguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    /*
    * starting method
    * this is the main method, which is run after the application is started.
    * Hiding the action bar - the title bar
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    /*
    * onClick method - this method is run after
     * the register button is clicked on main activity.
     * Starting new activity - register activity
    * */
    public void onLoginClick(View view){
        /*
        * TODO:
         * Check if filled name and password are correct
          * */
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
    }

    public void onRegisterClick(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
