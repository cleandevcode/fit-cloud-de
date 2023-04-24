package b7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import gm.l;
import p000do.a;
import x6.f;
import x6.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final Context f4024a;

    /* renamed from: b7.a$a */
    /* loaded from: classes.dex */
    public static final class ServiceConnectionC0051a implements ServiceConnection {
        public ServiceConnectionC0051a() {
            a.this = r1;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f c0555a;
            l.f(componentName, "name");
            l.f(iBinder, WiseOpenHianalyticsData.UNION_SERVICE);
            int i10 = f.a.f30360a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.github.kilnn.sport.ISportService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                c0555a = (f) queryLocalInterface;
            } else {
                c0555a = new f.a.C0555a(iBinder);
            }
            a.b bVar = p000do.a.f13275a;
            bVar.t("AutoFinishSportProxy");
            bVar.h("finishSport", new Object[0]);
            c0555a.u();
            bVar.t("AutoFinishSportProxy");
            bVar.h("unbindService", new Object[0]);
            a.this.f4024a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            l.f(componentName, "name");
        }
    }

    public a(Context context) {
        String str;
        l.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        this.f4024a = applicationContext;
        ServiceConnectionC0051a serviceConnectionC0051a = new ServiceConnectionC0051a();
        k.f30377a.getClass();
        Class<? extends x6.c> cls = k.f30380d;
        if (cls != null) {
            boolean bindService = applicationContext.bindService(new Intent(applicationContext, cls), serviceConnectionC0051a, 1);
            a.b bVar = p000do.a.f13275a;
            bVar.t("AutoFinishSportProxy");
            Object[] objArr = new Object[1];
            if (bindService) {
                str = "success";
            } else {
                str = "failed";
            }
            objArr[0] = str;
            bVar.h("bind service %s", objArr);
            return;
        }
        l.l("serviceClass");
        throw null;
    }
}
