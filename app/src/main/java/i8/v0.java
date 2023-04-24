package i8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import i8.b;

/* loaded from: classes.dex */
public final class v0 extends l0 {

    /* renamed from: g */
    public final IBinder f16721g;

    /* renamed from: h */
    public final /* synthetic */ b f16722h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f16722h = bVar;
        this.f16721g = iBinder;
    }

    @Override // i8.l0
    public final void c(f8.a aVar) {
        b.InterfaceC0293b interfaceC0293b = this.f16722h.f16591o;
        if (interfaceC0293b != null) {
            ((c0) interfaceC0293b).f16607a.k(aVar);
        }
        this.f16722h.getClass();
        System.currentTimeMillis();
    }

    @Override // i8.l0
    public final boolean d() {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.f16721g;
            p.f(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f16722h.v().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f16722h.v() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface n10 = this.f16722h.n(this.f16721g);
        if (n10 == null) {
            return false;
        }
        if (!b.A(this.f16722h, 2, 4, n10) && !b.A(this.f16722h, 3, 4, n10)) {
            return false;
        }
        b bVar = this.f16722h;
        bVar.f16595s = null;
        b.a aVar = bVar.f16590n;
        if (aVar != null) {
            ((b0) aVar).f16600a.f0();
        }
        return true;
    }
}
