package com.mirea.Chernets.loadermanger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class PlayerService extends Service {
    public PlayerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        return START_STICKY;
    }
}
