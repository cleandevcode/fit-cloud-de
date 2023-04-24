package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import f3.m;
import g3.l;
import p3.f;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f3672a = m.e("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Intent f3673a;

        /* renamed from: b */
        public final /* synthetic */ Context f3674b;

        /* renamed from: c */
        public final /* synthetic */ BroadcastReceiver.PendingResult f3675c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3673a = intent;
            this.f3674b = context;
            this.f3675c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                boolean booleanExtra = this.f3673a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3673a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3673a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3673a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m.c().a(ConstraintProxyUpdateReceiver.f3672a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                f.a(this.f3674b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                f.a(this.f3674b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                f.a(this.f3674b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                f.a(this.f3674b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3675c.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            m.c().a(f3672a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
            return;
        }
        ((r3.b) l.d(context).f14896d).a(new a(intent, context, goAsync()));
    }
}
