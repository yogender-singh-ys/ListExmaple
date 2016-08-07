package com.example.yogenders.listexmaple;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // array of string to be displayed
        String[] WeekDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        ListAdapter WeekDaysAdpater = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,WeekDays);

        ListView list_days = (ListView) findViewById(R.id.main_listview);

        list_days.setAdapter(WeekDaysAdpater);

        list_days.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String week = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, week, Toast.LENGTH_SHORT).show();

            }
        });


    }


}


