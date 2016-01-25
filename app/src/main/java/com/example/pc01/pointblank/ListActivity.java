package com.example.pc01.pointblank;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    String[]  myStringArray={
            "Approval PR 01-01-2016",
            "Approval PO 01-01-2016",
            "Approval LPB 01-01-2016",
            "Approval Perintah Bayar 01-01-2016"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter=new
                ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                myStringArray);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        String cities = String.valueOf(parent.getItemAtPosition(position));
                       // Toast.makeText(view.getContext(), cities, Toast.LENGTH_LONG).show();

                        Intent myIntent = new Intent();

                        myIntent.setClass(ListActivity.this,TableActivity.class);
//                        myIntent.putExtra("head", cities);
                        startActivity(myIntent);

                    }


                });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
