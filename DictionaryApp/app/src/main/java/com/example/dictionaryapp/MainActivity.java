package com.example.dictionaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] dynamic = {"OK!", "This", "is", "Epic!"}


        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        dynamic);

        ListView list = (ListView) findViewById(R.id.dynamic_list);
        list.setAdapter(adapter);

        // set up onclick for the dynamic list (cannot be done via XML integration)
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            // Using an anonymous inner class as we are not allowed to pass methods in Java
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // the code for the listener function
                MakeToast("the user clicked item " + position);
            }
        });

    }

    public void MakeToast(String text) {
        Toast.makeText(this, "The Color is now: " + text, Toast.LENGTH_LONG).show();
        Log.d("Toast", text + " toast now on screen");
    }
    

}
