package com.example.department;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String []listviewitems=new String[]{
            "CSE","CIVIL","MECH","ECE","EEE","IT"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,android.R.id.text1,listviewitems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tempListView=listviewitems[position].toString();
                Intent intent=new Intent(MainActivity.this,secondactivity.class);
                intent.putExtra("Listviewclickvalue",tempListView);

                startActivity(intent);
            }
        });


    }
}
