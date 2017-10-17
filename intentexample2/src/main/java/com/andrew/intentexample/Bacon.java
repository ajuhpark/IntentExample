/**
 *We need to allow this class to accept info from the
 * apples class.
 */
package com.andrew.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;



public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        /*
        Trying to get this class to accept info.  In order to do that,
        we call the Bundle class and we'll call this applesData.
        Then we're going to call getIntent and getExtras. This way, we'll
        get any extra information once it's launched from somewhere.
         */
        Bundle applesData = getIntent().getExtras();

        /*
        this tests the info. if applesData = null (maybe they
        didn't type anything in or it doesn't have data) then we
        want to just return because it doesn't have any text to accept.
        this way we won't get errors. If it passes this test then it must
        mean user typed in something.
         */
        if(applesData==null){
            return;
        }

        /*
        We create the string appleMessage that takes from the
        appleData class. Then we create a TextView tvBacon.
        We'll then set the applesMessage to the tvBacon.
         */
        String appleMessage = applesData.getString("appleMessage");

        /*
        Next thing we want to do is get a reference to the Bacon
        TextView and set it equal to the newly formed variable.
         */
        TextView BaconText = (TextView) findViewById(R.id.baconText);
        BaconText.setText(appleMessage);


    }

    /*
    this is the method that will be called whenever the user
    clicks the button.
     */
    public void onClick(View view) {
        /*
        first thing we need to do is create an instance of
        the intent class. The Apple.class is the only
        parameter that we have to look at. So it goes there
        to the Bacon class.
         */
        Intent i = new Intent(this, apples.class);

        //this launches the above and starts the activity.
        startActivity(i);

    }
}