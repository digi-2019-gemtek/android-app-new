package com.example.subject1;

import android.app.Application;
import com.example.io_ctrl.BluetoothLeService;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

public class JISK extends Application {
    private final static String TAG = "JISK CLASS"; //DeviceControlActivity.class.getSimpleName();
    public static ServiceConnection mServiceConnection = null;
    static BluetoothLeService mBluetoothLeService;

    static String mDeviceName;
    static String mDeviceAddress;



    public void getServiceConnection()
    {
        if(mServiceConnection == null)
        {
            mServiceConnection = new ServiceConnection() {

                @Override
                public void onServiceConnected(ComponentName componentName, IBinder service) {
                    Log.e("DeviceControlActivity","onServiceConnected_start");
                    mBluetoothLeService = ((BluetoothLeService.LocalBinder) service).getService();
                    if (!mBluetoothLeService.initialize()) {
                        Log.e(TAG, "Unable to initialize Bluetooth");
                        Log.e("DeviceControlActivity","finish_end");
                        //finish();
                    }
                    // Automatically connects to the device upon successful start-up initialization.
                    mBluetoothLeService.connect(mDeviceAddress);
                    Log.e("DeviceControlActivity","onServiceConnected_end");
                }

                @Override
                public void onServiceDisconnected(ComponentName componentName) {
                    Log.e("DeviceControlActivity","onServiceDisconnected_start");
                    mBluetoothLeService = null;
                    Log.e("DeviceControlActivity","onServiceDisconnected_end");
                }
            };
        }
    }
}
