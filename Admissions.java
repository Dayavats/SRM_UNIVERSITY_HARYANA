package com.example.lenovo.srm_university_haryana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 9/10/2017.
 */

public class Admissions extends Activity {
    Button course,admissionproecedure,Elg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admissions);
        course=(Button)(findViewById(R.id.coursesoffer));
        admissionproecedure=(Button)(findViewById(R.id.admsnprocedr));
        Elg=(Button)(findViewById(R.id.elgibility));
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Admissions.this,CoursesOfferd.class);

                startActivity(intent);
            }
        });
        admissionproecedure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Admissions.this,AdmissionsProcedure.class);
                startActivity(intent);
            }
        });

Elg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent  intent=new Intent(Admissions.this,Eligibilty.class);
        startActivity(intent);
    }
});

    }
}