package com.example.subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.widget.ImageButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.Switch;



public class MainActivity extends AppCompatActivity {

    JISK myapp; //add on 2019.10.8
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("MainActivity","onCreate_18" );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","20");

        //add on 2019.10.8 for access
        myapp = (JISK)getApplicationContext();
        //

        Button btn_sw=findViewById(R.id.btn_sw);
        btn_sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switch_page=new Intent(MainActivity.this,SWITCH.class);
                startActivity(switch_page);
            }
        });

        Button btn_eng=findViewById(R.id.btn_eng);
        btn_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eng_page=new Intent(MainActivity.this,Engineering.class);
                startActivity(eng_page);
            }
        });
        /*btn_eng.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                return false;
            }
        });*/

        Button btn_time=findViewById(R.id.btn_time);
        btn_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent time_pae=new Intent(MainActivity.this,Condition.class);
                startActivity(time_pae);
            }
        });

        Button btn_operate=findViewById(R.id.btn_operate);
        btn_operate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent operate_page=new Intent(MainActivity.this,Record.class);
                startActivity(operate_page);
            }
        });

        Button btn_set=findViewById(R.id.btn_set);
        btn_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("MainActivity", "Btn_set_start " );
                Intent set_page=new Intent(MainActivity.this,Setting.class);
                Log.e("MainActivity", "Btn_Intent_start " );
                startActivity(set_page);
                Log.e("MainActivity", "Btn_set_end" );
            }
        });

        /* Button btn_RETURN= findViewById(R.id.btn_RETURN);
        btn_RETURN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("MainActivity", "finish_start " );
                finish();
                Log.e("MainActivity", "finish_start " );
            }
        });*/
    }
}