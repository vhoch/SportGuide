package com.example.sportguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // creates backward arrow button
    }

    /* Backward arrow button is working with this*/
    @Override
    public boolean onOptionsItemSelected(MenuItem menu){
        switch(menu.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menu);
    }

    public void onFootballClick(View view) {
        Intent intent = new Intent(this, Football.class);
        startActivity(intent);
    }

    public void onBasketballClick(View view) {
        Intent intent = new Intent(this, Basketball.class);
        startActivity(intent);
    }

    public void onVolleyballClick(View view) {
        Intent intent = new Intent(this, VollyBall.class);
        startActivity(intent);
    }

    public void onCricketClick(View view) {
        Intent intent = new Intent(this, Cricket.class);
        startActivity(intent);
    }

    public void onRunningClick(View view) {
        Intent intent = new Intent(this, RUNNING.class);
        startActivity(intent);
    }

}
