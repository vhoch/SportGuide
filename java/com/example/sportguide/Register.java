package com.example.sportguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity{

    /**
     * onCreate - its called after the register button in main activity
     * is clicked, creating the new activity
     * getSupportActionBar() - setting the backward button on left top enabled
     */

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    /*
    * onOptionsItemSelected(), this method is there to set where the backward button should transfer,
    * in this case it transfer to the home page (main activity)
    * */
    public boolean onOptionsItemSelected(MenuItem menu){
        switch(menu.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menu);
    }
    /*
    * This is there just to set true after menu is creating the backward button.
    * to set visible.
    * */
    public boolean onCreateOptionsMenu(Menu menu){
        return true;
    }
    /*
    * onLoginClick is called after the login button is clicked
    * starting categories activity
    * */
    public void onRegisterClick(View view){
        /*
        * TODO:
        * Check if credentials are correct*/
        EditText name = (EditText) findViewById(R.id.nameEditable);
        EditText age = (EditText) findViewById(R.id.ageEditable);
        EditText email = (EditText) findViewById(R.id.emailEditable);
        EditText nickname = (EditText) findViewById(R.id.nicknameEditable);
        EditText password = (EditText) findViewById(R.id.passwordEditable);

        /* Not sure if this is necessary (Looks like it is not)*/
        /*
        String sname = name.getText().toString();
        String sage = age.getText().toString();
        String semail = email.getText().toString();
        String snickname = nickname.getText().toString();
*/
        if (name.getText().toString().equals("")) {
            Toast.makeText(this, "You did not input your name", Toast.LENGTH_SHORT).show();
        } else if(age.getText().toString().equals("")) {
            Toast.makeText(this, "You did not input your age", Toast.LENGTH_SHORT).show();
        } else if (email.getText().toString().equals("")) {
            Toast.makeText(this, "You did not input your email", Toast.LENGTH_SHORT).show();
        } else if (nickname.getText().toString().equals("")) {
            Toast.makeText(this, "You did not input your nickname", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().equals("")) {
            Toast.makeText(this, "You did not input your password", Toast.LENGTH_SHORT).show();
        } else {
            Intent categories = new Intent(this, Categories.class);
            startActivity(categories);
        }
    }
}
