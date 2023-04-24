package com.realsil.sdk.core.base;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Keep;
import ge.b;

/* loaded from: classes.dex */
public abstract class BaseService extends Service {

    /* renamed from: a */
    public DisplayManager f9452a;
    @Keep
    public Context mContext;
    @Keep
    public int notificationId = 1230;

    /* renamed from: b */
    public final a f9453b = new a();

    /* loaded from: classes.dex */
    public class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        b.n("in onBind()");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.mContext = this;
        DisplayManager displayManager = (DisplayManager) getSystemService("display");
        this.f9452a = displayManager;
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f9453b, null);
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("rtk_channel_id", "rtk_channel_name", 0);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            NotificationManager notificationManager2 = (NotificationManager) getSystemService("notification");
            if (notificationManager2 != null) {
                notificationManager2.createNotificationChannel(notificationChannel);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        DisplayManager displayManager = this.f9452a;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.f9453b);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(1);
        } else {
            stopForeground(true);
        }
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        b.n("in onRebind()");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        b.d("Last client unbound from service");
        return true;
    }
}
