package com.example.serverapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class PluginService1 extends Service {
    static final String LOG_TAG = "PluginService1";

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
       // throw new UnsupportedOperationException("Not yet implemented");
        return mBinder;
    }
    private final IMyAidlInterface.Stub mBinder = new IMyAidlInterface.Stub() {


        @Override
        public int operation(int num1, int num2) throws RemoteException {
            return num1+num2;
        }
    };

}
