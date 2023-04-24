package cn.sharesdk.framework.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public class c {
    public static PendingIntent a(Context context, int i10, Intent intent, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 67108864;
        }
        return PendingIntent.getBroadcast(context, i10, intent, i11);
    }
}
