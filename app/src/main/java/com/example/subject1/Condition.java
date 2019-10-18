package com.example.subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Condition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition);

        Button btn_RETURN =findViewById(R.id.btn_RETURN);
        btn_RETURN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button btn_time =findViewById(R.id.btn_time);
        btn_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent time=new Intent(Condition.this,Timepage.class);
                Log.e("Condition", "Intent_e:-32 " );
                startActivity(time);
                Log.e("Condition", "startActivity_e:-34 " );
            }
        });

        Button btn_conditio=findViewById(R.id.btn_conditio);
        btn_conditio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Condition", "onClick_s:-42 " );
                Intent condi=new Intent(Condition.this,Conditionpage.class);
                Log.e("Condition", "Intent_e:-43 " );
                startActivity(condi);
                Log.e("Condition", "startActivity_e:-45 " );
            }
        });
    }
}
