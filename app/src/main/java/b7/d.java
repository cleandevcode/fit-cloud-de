package b7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import gm.l;
import x6.f;

/* loaded from: classes.dex */
public final class d implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ b f4033a;

    public d(b bVar) {
        this.f4033a = bVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f c0555a;
        l.f(componentName, "name");
        l.f(iBinder, WiseOpenHianalyticsData.UNION_SERVICE);
        b bVar = this.f4033a;
        if (!bVar.f4029d) {
            return;
        }
        int i10 = f.a.f30360a;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.github.kilnn.sport.ISportService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
            c0555a = (f) queryLocalInterface;
        } else {
            c0555a = new f.a.C0555a(iBinder);
        }
        bVar.f4028c = c0555a;
        try {
            b bVar2 = this.f4033a;
            f fVar = bVar2.f4028c;
            if (fVar != null) {
                fVar.g0(bVar2.f4031f);
            }
            this.f4033a.f4031f.k();
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l.f(componentName, "name");
        b bVar = this.f4033a;
        bVar.getClass();
        try {
            f fVar = bVar.f4028c;
            if (fVar != null) {
                fVar.e(bVar.f4031f);
            }
            bVar.f4031f.a0();
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
        bVar.f4028c = null;
    }
}
