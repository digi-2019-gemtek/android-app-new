package com.example.subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Certification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certification);

        Button btn_determine =findViewById(R.id.btn_determine);
        btn_determine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Certification","22");
                Intent certification_page=new Intent();// need to judge the passeord right or wrong
                certification_page.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                certification_page.setClass(Certification.this, DeviceScanActivity.class);

                Log.e("Certification","24");
                startActivity(certification_page);
                Log.e("Certification","25");//In this function, suppose the answer is correct
            }
        });

        Button btn_forget_pass=findViewById(R.id.btn_forget_pass);
        btn_forget_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hint_page=new Intent(Certification.this,Hint.class);
                startActivity(hint_page);
            }
        });
    }
}
