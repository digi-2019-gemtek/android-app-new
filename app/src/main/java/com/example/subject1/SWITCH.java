package com.example.subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.io_ctrl.BluetoothLeService;

public class SWITCH extends AppCompatActivity {

    //JISK myapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        Button btn_ope=findViewById(R.id.btn_ope);
        btn_ope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetController.gateUpSideDown(JISK.mBluetoothLeService, 1);
            }
        });

        Button btn_RETURN =findViewById(R.id.btn_RETURN);
        btn_RETURN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
