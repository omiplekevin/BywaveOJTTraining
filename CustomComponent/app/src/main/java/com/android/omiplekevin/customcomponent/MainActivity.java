package com.android.omiplekevin.customcomponent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.omiplekevin.customcomponent.adapter.CustomListViewAdapter;
import com.android.omiplekevin.customcomponent.dao.CustomContent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CustomContent> contents = new ArrayList<CustomContent>();
        for (int i = 0; i < 100; i++) {
            contents.add(
                    new CustomContent(
                            R.mipmap.ic_launcher,
                            "Content " + (i + 1)
                    ));
        }

        //bind listview
        listView = findViewById(R.id.listView);
        //declare custom adapter
        final CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter(
                this,
                R.layout.layout_listview_list_item,
                contents);

        //set custom adapter to listview
        listView.setAdapter(customListViewAdapter);

        //add onitemclick event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String content = customListViewAdapter.getItem(i).content;
                Log.d(TAG, "onItemClick: " + content);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                String content = customListViewAdapter.getItem(i).content;
                Log.d(TAG, "onItemLongClick: " + content);
                return false;
            }
        });
    }
}
