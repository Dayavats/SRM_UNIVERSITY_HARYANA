package com.example.lenovo.srm_university_haryana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mydialog extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydialog);
        Intent intent=new Intent();
        if(intent!=null){
            intent.getStringExtra("dept");


        }
    }
    public void closeDialog(View v){
        finish();
    }
}
