package i8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class u0 implements ServiceConnection {

    /* renamed from: a */
    public final int f16719a;

    /* renamed from: b */
    public final /* synthetic */ b f16720b;

    public u0(b bVar, int i10) {
        this.f16720b = bVar;
        this.f16719a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l o0Var;
        int i10;
        int i11;
        b bVar = this.f16720b;
        if (iBinder == null) {
            synchronized (bVar.f16582f) {
                i10 = bVar.f16589m;
            }
            if (i10 == 3) {
                bVar.f16596t = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            r0 r0Var = bVar.f16581e;
            r0Var.sendMessage(r0Var.obtainMessage(i11, bVar.f16598v.get(), 16));
            return;
        }
        synchronized (bVar.f16583g) {
            b bVar2 = this.f16720b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof l)) {
                o0Var = (l) queryLocalInterface;
            } else {
                o0Var = new o0(iBinder);
            }
            bVar2.f16584h = o0Var;
        }
        b bVar3 = this.f16720b;
        int i12 = this.f16719a;
        r0 r0Var2 = bVar3.f16581e;
        r0Var2.sendMessage(r0Var2.obtainMessage(7, i12, -1, new w0(bVar3, 0)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar;
        synchronized (this.f16720b.f16583g) {
            bVar = this.f16720b;
            bVar.f16584h = null;
        }
        r0 r0Var = bVar.f16581e;
        r0Var.sendMessage(r0Var.obtainMessage(6, this.f16719a, 1));
    }
}
