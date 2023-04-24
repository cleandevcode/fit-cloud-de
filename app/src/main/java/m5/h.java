package m5;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final double f20371a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b */
    public static final /* synthetic */ int f20372b = 0;

    public static double a(long j10) {
        return (SystemClock.elapsedRealtimeNanos() - j10) * f20371a;
    }
}
