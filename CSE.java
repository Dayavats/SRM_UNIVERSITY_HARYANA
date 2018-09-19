package com.example.lenovo.srm_university_haryana;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lenovo on 11/27/2017.
 */

public class CSE extends Activity {
    TextView cse1,cse2,cse3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse);
        cse1=(TextView)findViewById(R.id.cse1);
        cse2=(TextView)findViewById(R.id.cse2);
        cse3=(TextView)findViewById(R.id.cse3);
        cse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://www.srmuniversity.ac.in/pdf/syllabus/CSE_1st%20year_2017-18.pdf";
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        cse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://www.srmuniversity.ac.in/pdf/syllabus/CSE_Big_Data_1st_year_2017-18.pdf";
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        cse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://www.srmuniversity.ac.in/pdf/syllabus/CSE_Cloud_Mobile_1st_year_2017-18.pdf";
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });



    }
}