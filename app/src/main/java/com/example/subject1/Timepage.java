package com.example.subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Timepage extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    private SharedPreferences settings;
    /*=getPreferences(MODE_PRIVATE)
     SharedPreferences.Editor editor = settings.edit();*/
    private static final String data = "DATA";
    private static final String h = "S_H";
    private  static final String m="S_M";

    private TextView startTime;
    private TextView endTime;
    private Button   btn_RETURN;
    private Button   btn_determine;
    private Button   btn_raed;
    private Button   btn_ope;
    private Button   btn_close;

    int hour,minute;
    int hour_x,minute_x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepage);
        btn_RETURN=findViewById(R.id.btn_RETURN);
        btn_determine=findViewById(R.id.btn_determine);
        btn_ope=findViewById(R.id.btn_ope);
        btn_close=findViewById(R.id.btn_close);
        startTime=findViewById(R.id.tev_1);
        endTime=findViewById(R.id.tev_2);

        btn_RETURN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_ope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                hour=c.get(Calendar.HOUR);
                minute=c.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog=new TimePickerDialog(Timepage.this,Timepage.this,hour,minute,true);
                timePickerDialog.show();
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                hour=c.get(Calendar.HOUR);
                minute=c.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog=new TimePickerDialog(Timepage.this,Timepage.this,hour,minute,true);
                timePickerDialog.show();
            }
        });
    }
    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
        Log.e("Timepage","86");
        hour_x=i;
        minute_x=i1;
        Calendar c=Calendar.getInstance();
        startTime.setText("hour："+hour_x+"minute"+minute_x);
        Log.e("Timepage","91");
    }
}
