package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.x;
import androidx.work.impl.foreground.a;
import f3.g;
import f3.m;
import g3.c;
import g3.l;
import java.util.Map;
import java.util.UUID;
import n3.d;
import r3.b;

/* loaded from: classes.dex */
public class SystemForegroundService extends x implements a.InterfaceC0040a {

    /* renamed from: f */
    public static final String f3719f = m.e("SystemFgService");

    /* renamed from: b */
    public Handler f3720b;

    /* renamed from: c */
    public boolean f3721c;

    /* renamed from: d */
    public a f3722d;

    /* renamed from: e */
    public NotificationManager f3723e;

    public final void c() {
        this.f3720b = new Handler(Looper.getMainLooper());
        this.f3723e = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f3722d = aVar;
        if (aVar.f3734j != null) {
            m.c().b(a.f3724k, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.f3734j = this;
        }
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f3722d;
        aVar.f3734j = null;
        synchronized (aVar.f3728d) {
            aVar.f3733i.c();
        }
        c cVar = aVar.f3726b.f14898f;
        synchronized (cVar.f14872k) {
            cVar.f14871j.remove(aVar);
        }
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        int i12 = 0;
        if (this.f3721c) {
            m.c().d(f3719f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            a aVar = this.f3722d;
            aVar.f3734j = null;
            synchronized (aVar.f3728d) {
                aVar.f3733i.c();
            }
            c cVar = aVar.f3726b.f14898f;
            synchronized (cVar.f14872k) {
                cVar.f14871j.remove(aVar);
            }
            c();
            this.f3721c = false;
        }
        if (intent != null) {
            a aVar2 = this.f3722d;
            aVar2.getClass();
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                m.c().d(a.f3724k, String.format("Started foreground service %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                ((b) aVar2.f3727c).a(new n3.b(aVar2, aVar2.f3726b.f14895c, stringExtra));
            } else if (!"ACTION_NOTIFY".equals(action)) {
                if ("ACTION_CANCEL_WORK".equals(action)) {
                    m.c().d(a.f3724k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                    String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                        l lVar = aVar2.f3726b;
                        UUID fromString = UUID.fromString(stringExtra2);
                        lVar.getClass();
                        ((b) lVar.f14896d).a(new p3.a(lVar, fromString));
                    }
                } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    m.c().d(a.f3724k, "Stopping foreground service", new Throwable[0]);
                    a.InterfaceC0040a interfaceC0040a = aVar2.f3734j;
                    if (interfaceC0040a != null) {
                        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0040a;
                        systemForegroundService.f3721c = true;
                        m.c().a(f3719f, "All commands completed.", new Throwable[0]);
                        if (Build.VERSION.SDK_INT >= 26) {
                            systemForegroundService.stopForeground(true);
                        }
                        systemForegroundService.stopSelf();
                    }
                }
            }
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra3 = intent.getStringExtra("KEY_WORKSPEC_ID");
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            m.c().a(a.f3724k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra3, Integer.valueOf(intExtra2)), new Throwable[0]);
            if (notification != null && aVar2.f3734j != null) {
                aVar2.f3730f.put(stringExtra3, new g(intExtra, intExtra2, notification));
                if (TextUtils.isEmpty(aVar2.f3729e)) {
                    aVar2.f3729e = stringExtra3;
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar2.f3734j;
                    systemForegroundService2.f3720b.post(new n3.c(systemForegroundService2, intExtra, notification, intExtra2));
                } else {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar2.f3734j;
                    systemForegroundService3.f3720b.post(new d(systemForegroundService3, intExtra, notification));
                    if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry entry : aVar2.f3730f.entrySet()) {
                            i12 |= ((g) entry.getValue()).f14087b;
                        }
                        g gVar = (g) aVar2.f3730f.get(aVar2.f3729e);
                        if (gVar != null) {
                            SystemForegroundService systemForegroundService4 = (SystemForegroundService) aVar2.f3734j;
                            systemForegroundService4.f3720b.post(new n3.c(systemForegroundService4, gVar.f14086a, gVar.f14088c, i12));
                        }
                    }
                }
            }
        }
        return 3;
    }
}
