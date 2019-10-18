package com.example.subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Conditionpage extends AppCompatActivity {

    private SharedPreferences settings;
   /*=getPreferences(MODE_PRIVATE)
    SharedPreferences.Editor editor = settings.edit();*/
    private static final String data = "DATA";
    private  static final String edt_1="EDT_1";
    private  static final String edt_2="EDT_2";

    private EditText temperature;
    private EditText humidity;
    private Button   btn_RETURN;
    private Button   btn_determine;
    private Button   btn_raed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("Conditionpage"," onCreate_44");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditionpage);
        init();

        btn_determine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Conditionpage","btn_detemine_50");
                saveData();
                Log.e("Conditionpage","btn_detemine_52");
            }
        });

        btn_raed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Conditionpage","btn_read_57");
                readData();
                Log.e("Conditionpage","btn_read_59");
            }
        });

        btn_RETURN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void init(){
        btn_RETURN= findViewById(R.id.btn_RETURN);
        btn_determine=findViewById(R.id.btn_determine);
        btn_raed=findViewById(R.id.btn_read);
        temperature=findViewById(R.id.edt_1);
        humidity =findViewById(R.id.edt_2);
    }
    public void saveData(){
        Log.e("Conditionpage"," saveData_29");
        settings = getSharedPreferences(data,0);
        settings.edit()
                .putString(edt_1,temperature.getText().toString())
                .putString(edt_2, humidity.getText().toString())
                .commit();
    }

    public void readData(){
        Log.e("Conditionpage"," readData_37");
        settings = getSharedPreferences(data,0);
        temperature.setText(settings.getString(edt_1, ""));
        humidity.setText(settings.getString(edt_2, ""));
    }
}
