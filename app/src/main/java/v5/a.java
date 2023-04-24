package v5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import gm.l;
import o5.v;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l.f(componentName, "name");
        l.f(iBinder, WiseOpenHianalyticsData.UNION_SERVICE);
        c cVar = c.f29066a;
        f fVar = f.f29104a;
        Context a10 = v.a();
        Object obj = null;
        if (!i6.a.b(f.class)) {
            try {
                obj = f.f29104a.h(a10, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
            } catch (Throwable th2) {
                i6.a.a(f.class, th2);
            }
        }
        c.f29074i = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l.f(componentName, "name");
    }
}
