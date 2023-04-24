package i3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import f3.m;
import g3.l;
import o3.d;
import o3.f;
import o3.g;
import o3.i;
import p3.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final String f16427a = m.e("Alarms");

    public static void a(Context context, int i10, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.a(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        m.c().a(f16427a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j10) {
        int i10;
        WorkDatabase workDatabase = lVar.f14895c;
        i iVar = (i) workDatabase.t();
        g a10 = iVar.a(str);
        if (a10 != null) {
            a(context, a10.f22613b, str);
            c(context, str, a10.f22613b, j10);
            return;
        }
        synchronized (e.class) {
            workDatabase.c();
            Long a11 = ((f) workDatabase.s()).a("next_alarm_manager_id");
            int i11 = 0;
            if (a11 != null) {
                i10 = a11.intValue();
            } else {
                i10 = 0;
            }
            if (i10 != Integer.MAX_VALUE) {
                i11 = i10 + 1;
            }
            ((f) workDatabase.s()).b(new d(i11, "next_alarm_manager_id"));
            workDatabase.p();
            workDatabase.l();
        }
        iVar.b(new g(str, i10));
        c(context, str, i10, j10);
    }

    public static void c(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.a(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
