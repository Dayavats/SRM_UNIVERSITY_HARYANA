package com.example.lenovo.srm_university_haryana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lenovo on 11/23/2017.
 */

public class Engineering extends Activity {

    TextView ce,cse,me,bi,eee,ece;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.engineerin);
        ce=(TextView)findViewById(R.id.ce);
        me=(TextView)findViewById(R.id.me);
        cse=(TextView)findViewById(R.id.cse);
        eee=(TextView)findViewById(R.id.eee);
        bi=(TextView)findViewById(R.id.bi);
        ece=(TextView)findViewById(R.id.ece);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Engineering.this,CSE.class);
                startActivity(intent);
            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Engineering.this,ME.class);
                startActivity(intent);
            }
        }); ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Engineering.this,CE.class);
                startActivity(intent);
            }
        }); eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Engineering.this,EEE.class);
                startActivity(intent);
            }
        }); ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Engineering.this,ECE.class);
                startActivity(intent);
            }
        }); bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Engineering.this,BI.class);
                startActivity(intent);
            }
        });

    }

}
