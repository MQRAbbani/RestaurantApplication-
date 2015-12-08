package com.mcomm.restaurant;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
/**
 * Created by faizan on 2/16/2015.
 */
public class ContactDetails extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_details);

        // get action bar
        ActionBar actionBar = getActionBar();

        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}

