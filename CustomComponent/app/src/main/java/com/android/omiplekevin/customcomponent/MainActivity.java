package com.android.omiplekevin.customcomponent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] contents = {
                "content 1",
                "content 2",
                "content 3",
                "content 4",
                "content 5",
                "content 6",
                "content 7",
                "content 8",
                "content 9",
                "content 10",
                "content 11",
                "content 12",
                "content 13",
                "content 14",
                "content 15",
                "content 16",
                "content 17",
                "content 18",
                "content 19",
                "content 20",
                "content 21",
                "content 22",
                "content 23",
                "content 24",
                "content 25"};

        //basic view binding
        listView = findViewById(R.id.listView);

        //simple ArrayAdapter<String>
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                contents);

        //set adapter to ListView
        listView.setAdapter(stringArrayAdapter);
    }
}
