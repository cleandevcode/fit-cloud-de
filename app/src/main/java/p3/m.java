package p3;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static final String f23822a = f3.m.e("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f23823b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String b10 = a.b.b("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, b10);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f23823b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, b10);
        }
        return newWakeLock;
    }
}
