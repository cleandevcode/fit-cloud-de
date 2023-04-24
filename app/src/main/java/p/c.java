package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import p.f;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: a */
    public final /* synthetic */ Context f23723a;

    public c(Context context) {
        this.f23723a = context;
    }

    @Override // p.f
    public final void a(ComponentName componentName, f.a aVar) {
        try {
            aVar.f23724a.u0();
        } catch (RemoteException unused) {
        }
        this.f23723a.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
