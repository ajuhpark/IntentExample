package com.andrew.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
//we import the below for the import field.
import android.widget.EditText;


public class apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }

    /*
    this is the method that will be called whenever the user
    clicks the button.
     */
    public void onClick(View view){
        /*
        first thing we need to do is create an instance of
        the intent class. The Bacon.class is the only
        parameter that we have to look at. So it goes there
        to the Bacon class.
         */
        Intent i = new Intent(this, Bacon.class);


        //This is to get the text from the input in the apples screen
        final EditText applesInput = (EditText) findViewById(R.id.applesInput);

        /*
        now we want to get whatever string the user types into it.
        and this stores it into the userMessage variable.
         */
        String userMessage = applesInput.getText().toString();

        /*
        if there's anything you want to pass along to another activity
        you can call the putExtra method. The putExtra method takes any extra
        information in the form of a key value pair.
        The first parameter is what you want to call this piece of info - appleMessage.
        The second parameter is what you want to pass along - the userMessage.
        So now that we can pass it along, we just need to add the functionality to
        the Bacon.java class to handle it.
         */
        i.putExtra("appleMessage", userMessage);

        //this launches the above and starts the activity.
        startActivity(i);

    }
}
