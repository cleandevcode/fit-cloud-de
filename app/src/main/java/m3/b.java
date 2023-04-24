package m3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f3.m;

/* loaded from: classes.dex */
public final class b extends c<Boolean> {

    /* renamed from: i */
    public static final String f20330i = m.e("BatteryNotLowTracker");

    public b(Context context, r3.a aVar) {
        super(context, aVar);
    }

    @Override // m3.d
    public final Object a() {
        Intent registerReceiver = this.f20336b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver != null) {
            return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
        }
        m.c().b(f20330i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // m3.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // m3.c
    public final void f(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        m.c().a(f20330i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        b(bool);
    }
}
