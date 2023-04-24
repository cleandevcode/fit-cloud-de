package yb;

import android.util.Log;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public boolean f31373a = false;

    /* renamed from: b */
    public int f31374b = 4;

    public static void a(int i10, String str, String str2) {
        String a10 = android.support.v4.media.a.a(str, "=> ", str2);
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 6) {
                    Log.i("FormalHASDK", a10);
                    return;
                } else {
                    Log.e("FormalHASDK", a10);
                    return;
                }
            }
            Log.w("FormalHASDK", a10);
            return;
        }
        Log.d("FormalHASDK", a10);
    }
}
