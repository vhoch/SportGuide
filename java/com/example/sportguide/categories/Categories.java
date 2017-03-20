package com.example.sportguide.categories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Categories extends AppCompatActivity {
    /*
    * onCreate method, starting activity categories layout
    * again adding the backward button in title bar
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(com.example.sportguide.R.layout.activity_categories);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    /*
    * Same method like in register activity, calls when creates backward button
    * */
    @Override
    public boolean onOptionsItemSelected(MenuItem menu){
        switch(menu.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){return true;}
}
