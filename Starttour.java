package com.example.lenovo.srm_university_haryana;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 9/9/2017.
 */

public class Starttour extends Activity {


    Button admsn;
    Button abttus;
    Button dept;
    Button contact;
    Button weblinkk;
    Button result;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starttour);
        admsn=(Button)findViewById(R.id.admissions);
        abttus=(Button)findViewById(R.id.aboutus);
        dept=(Button)findViewById(R.id.departments);
        contact=(Button)findViewById(R.id.contactus);
        result=(Button)findViewById(R.id.map);



      abttus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Starttour.this,aboutUs.class);
                startActivity(intent);
            }
        });
        admsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Starttour.this,Admissions.class);
                startActivity(intent);
            }
        });
        dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Starttour.this,Departments.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7404802608"));
                startActivity(intent);
            }
        });
        weblinkk=(Button)findViewById(R.id.web);
        weblinkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://www.srmuniversity.ac.in";
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://117.239.224.139/srmhonline/online/results/onlineResult.jsp";
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });


            }




    }




