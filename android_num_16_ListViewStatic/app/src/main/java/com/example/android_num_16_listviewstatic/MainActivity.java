package com.example.android_num_16_listviewstatic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String [] cities = getResources().getStringArray(R.array.cities);
        ListView listView = (ListView)findViewById(R.id.listV1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                TextView outPut = (TextView)findViewById(R.id.set_change);
                outPut.setText("你選了: " + cities[position]);
            }
        });
    }
}