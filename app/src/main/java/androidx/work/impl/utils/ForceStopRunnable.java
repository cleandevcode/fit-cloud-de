package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import f1.a;
import f3.m;
import g3.l;
import java.util.concurrent.TimeUnit;
import p3.i;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: d */
    public static final String f3735d = m.e("ForceStopRunnable");

    /* renamed from: e */
    public static final long f3736e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a */
    public final Context f3737a;

    /* renamed from: b */
    public final l f3738b;

    /* renamed from: c */
    public int f3739c = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f3740a = m.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                m c10 = m.c();
                String str = f3740a;
                if (((m.a) c10).f14094b <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, l lVar) {
        this.f3737a = context.getApplicationContext();
        this.f3738b = lVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (a.a()) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f3736e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        androidx.work.a aVar = this.f3738b.f14894b;
        aVar.getClass();
        if (TextUtils.isEmpty(null)) {
            m.c().a(f3735d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a10 = i.a(this.f3737a, aVar);
        m.c().a(f3735d, String.format("Is default app process = %s", Boolean.valueOf(a10)), new Throwable[0]);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!b()) {
                return;
            }
            while (true) {
                g3.i.a(this.f3737a);
                m.c().a(f3735d, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f3739c + 1;
                    this.f3739c = i10;
                    if (i10 < 3) {
                        m.c().a(f3735d, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                        try {
                            Thread.sleep(this.f3739c * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        m.c().b(f3735d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        this.f3738b.f14894b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            this.f3738b.f();
        }
    }
}
