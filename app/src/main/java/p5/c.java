package p5;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o5.v;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f23890a = new c();

    /* renamed from: b */
    public static final String f23891b = c.class.getSimpleName();

    /* renamed from: c */
    public static final ReentrantReadWriteLock f23892c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public static String f23893d;

    /* renamed from: e */
    public static volatile boolean f23894e;

    public static void a() {
        if (f23894e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23892c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f23894e) {
                f23893d = PreferenceManager.getDefaultSharedPreferences(v.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f23894e = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f23892c.writeLock().unlock();
            throw th2;
        }
    }
}
