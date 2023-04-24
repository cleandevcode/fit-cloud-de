package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import f3.m;
import g3.l;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f3676a = m.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.c().a(f3676a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                l d10 = l.d(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                d10.getClass();
                synchronized (l.f14892l) {
                    d10.f14901i = goAsync;
                    if (d10.f14900h) {
                        goAsync.finish();
                        d10.f14901i = null;
                    }
                }
                return;
            } catch (IllegalStateException e10) {
                m.c().b(f3676a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
                return;
            }
        }
        String str = a.f3680d;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}
