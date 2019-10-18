package com.example.subject1;

import android.util.Log;
import com.example.io_ctrl.BluetoothLeService;

public class SetController {

    public static String numToHex16(int b) {
        Log.e("DeviceControlActivity","numToHex16:" + String.format("%04x", b));
        return String.format("%04x", b);//2��ʾ��Ҫ����16������
        //Log.e("DeviceControlActivity","numToHex16() end");
    }

    //add on 2019.9.23 - begin
    //for setting controller through BLE
    //action: 0:stop / 1:down / 2:up
    static void gateUpSideDown(BluetoothLeService mBluetoothLeService, int action) {
        if(action == 0)
        {
            mBluetoothLeService.function_fc( "00010201000A1F8E","ff" );
        }
        else if(action == 1)
        {
            mBluetoothLeService.function_fc( "00010201010A1F8E","ff" );
        }
        else
        {
            mBluetoothLeService.function_fc( "00010201020A1F8E","ff" );
        }
        //
        Log.e("DeviceControlActivity","gateUpSideDown() end");
    }
    //add on 2019.9.23 - end



    //add on 2019.10.07 by Sabrina
    //start
    //set the controller through time
    static void setUpTime(BluetoothLeService mBluetoothLeService, int hourStart, int minuteStart, int hourEnd, int minuteEnd){
        mBluetoothLeService.function_fc( "020B0011"+numToHex16(hourStart)+numToHex16(minuteStart)+
                numToHex16(hourEnd)+numToHex16(minuteEnd),"ff" );
    }

    //set the controller in two conditions -- mud wet and mud temperature
    static void setUpCondition(BluetoothLeService mBluetoothLeService, int mudWet, int mudTemp)
    {
        //mBluetoothLeService.function_fc();
    }
    //end
    //add on 2019.10.07 by Sabrina
}