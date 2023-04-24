package m3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import f3.m;

/* loaded from: classes.dex */
public final class a extends c<Boolean> {

    /* renamed from: i */
    public static final String f20329i = m.e("BatteryChrgTracker");

    public a(Context context, r3.a aVar) {
        super(context, aVar);
    }

    @Override // m3.d
    public final Object a() {
        int intExtra;
        Intent registerReceiver = this.f20336b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            m.c().b(f20329i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // m3.c
    public final IntentFilter e() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
        if (r7.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L27;
     */
    @Override // m3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L7
            return
        L7:
            f3.m r0 = f3.m.c()
            java.lang.String r1 = m3.a.f20329i
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r5 = "Received %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.a(r1, r3, r5)
            int r0 = r7.hashCode()
            r1 = 3
            r3 = 2
            switch(r0) {
                case -1886648615: goto L49;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L27;
            }
        L27:
            goto L51
        L28:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L31
            goto L51
        L31:
            r4 = 3
            goto L52
        L33:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3c
            goto L51
        L3c:
            r4 = 2
            goto L52
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L47
            goto L51
        L47:
            r4 = 1
            goto L52
        L49:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L52
        L51:
            r4 = -1
        L52:
            if (r4 == 0) goto L5e
            if (r4 == r2) goto L5e
            if (r4 == r3) goto L5b
            if (r4 == r1) goto L5b
            goto L63
        L5b:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L60
        L5e:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L60:
            r6.b(r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a.f(android.content.Intent):void");
    }
}
