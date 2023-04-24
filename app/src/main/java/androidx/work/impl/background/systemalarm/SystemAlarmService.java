package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.x;
import androidx.work.impl.background.systemalarm.d;
import f3.m;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends x implements d.c {

    /* renamed from: d */
    public static final String f3677d = m.e("SystemAlarmService");

    /* renamed from: b */
    public d f3678b;

    /* renamed from: c */
    public boolean f3679c;

    public final void c() {
        d dVar = new d(this);
        this.f3678b = dVar;
        if (dVar.f3709j != null) {
            m.c().b(d.f3699k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.f3709j = this;
        }
    }

    public final void d() {
        this.f3679c = true;
        m.c().a(f3677d, "All commands completed in dispatcher", new Throwable[0]);
        String str = p3.m.f23822a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = p3.m.f23823b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                m.c().f(p3.m.f23822a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
        this.f3679c = false;
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3679c = true;
        this.f3678b.d();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3679c) {
            m.c().d(f3677d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3678b.d();
            c();
            this.f3679c = false;
        }
        if (intent != null) {
            this.f3678b.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
