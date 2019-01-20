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

    private ArrayAdapter<String> adapter;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] dynamic = {"OK!", "This", "is", "Epic!"};


        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                dynamic);

        list = (ListView) findViewById(R.id.dynamic_list);
        list.setAdapter(adapter);

        // set up onclick for the dynamic list (cannot be done via XML integration)
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            // Using an anonymous inner class as we are not allowed to pass methods in Java
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // the code for the listener function
                String item = adapter.getItem(position);
                MakeToast("the user clicked " + item);
                adapter.add(item);
                adapter.notifyDataSetChanged();
            }
        });

    }

    public void MakeToast(String text) {
        Toast.makeText(this, "The Color is now: " + text, Toast.LENGTH_LONG).show();
        Log.d("Toast", text + " toast now on screen");
    }


}
