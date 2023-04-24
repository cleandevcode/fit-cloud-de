package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.k;

/* loaded from: classes.dex */
public class x extends Service implements u {

    /* renamed from: a */
    public final r0 f2806a = new r0(this);

    @Override // androidx.lifecycle.u
    public final v a0() {
        return this.f2806a.f2774a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f2806a.a(k.b.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2806a.a(k.b.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        r0 r0Var = this.f2806a;
        r0Var.a(k.b.ON_STOP);
        r0Var.a(k.b.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f2806a.a(k.b.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
