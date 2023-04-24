package qc;

import android.bluetooth.BluetoothGatt;
import kc.h;
import oc.c1;

/* loaded from: classes.dex */
public final class b0 implements v3.c<a0> {

    /* renamed from: a */
    public final w3.a<c1> f24689a;

    /* renamed from: b */
    public final w3.a<BluetoothGatt> f24690b;

    /* renamed from: c */
    public final w3.a<pc.c> f24691c;

    /* renamed from: d */
    public final w3.a<m0> f24692d;

    /* renamed from: e */
    public final w3.a<tk.o> f24693e;

    /* renamed from: f */
    public final w3.a<tk.o> f24694f;

    /* renamed from: g */
    public final w3.a<c0> f24695g;

    public b0(w3.a aVar, w3.a aVar2, w3.a aVar3, oc.i iVar, w3.a aVar4, d0 d0Var) {
        kc.h hVar = h.a.f18323a;
        this.f24689a = aVar;
        this.f24690b = aVar2;
        this.f24691c = aVar3;
        this.f24692d = iVar;
        this.f24693e = aVar4;
        this.f24694f = hVar;
        this.f24695g = d0Var;
    }

    @Override // w3.a
    public final Object get() {
        return new a0(this.f24689a.get(), this.f24690b.get(), this.f24691c.get(), this.f24692d.get(), this.f24693e.get(), this.f24694f.get(), this.f24695g);
    }
}
