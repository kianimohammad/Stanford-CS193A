package com.example.dictionary20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private String word_list[] = new String[1000];
    private String definition_list[] = new String[1000];
    private ArrayAdapter<String> adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readWordsFromFile();

        listView = (ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, word_list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                makeToast(definition_list[position]);
            }
        });
    }

    private void readWordsFromFile() {
        int index = 0;
        Scanner scanner = new Scanner(getResources().openRawResource(R.raw.grewords));
        scanner.useDelimiter("\n");

        while(scanner.hasNext()){
            String word = scanner.next();
            String definition = scanner.next();

            word_list[index] = word;
            definition_list[index] = definition;
            index++;
        }
    }

    private void makeToast(String item) {
        Toast.makeText(this, item, Toast.LENGTH_LONG);
    }

}
