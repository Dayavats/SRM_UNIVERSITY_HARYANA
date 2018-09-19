package com.example.lenovo.srm_university_haryana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by Lenovo on 10/28/2017.
 */

public class Departments extends Activity  {
TextView eng,mg,comm,law,phy;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.departments);


        eng=(TextView)findViewById(R.id.et);
        mg=(TextView)findViewById(R.id.mn);
        law=(TextView)findViewById(R.id.law);
        comm=(TextView)findViewById(R.id.cm);
        phy=(TextView)findViewById(R.id.phe);
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(Departments.this,Engineering.class);
                startActivity(intent);
            }
        });
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(Departments.this,Management.class);
                startActivity(intent);
            }
        });
        comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(Departments.this,Commerce.class);
                startActivity(intent);
            }
        });
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(Departments.this,Law.class);
                startActivity(intent);
            }
        });
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(Departments.this,Physical.class);
                startActivity(intent);
            }
        });
    }
}


