package oc;

import android.bluetooth.BluetoothGatt;

/* loaded from: classes.dex */
public final class j1 implements v3.c<e1> {

    /* renamed from: a */
    public final w3.a<sc.d> f23006a;

    /* renamed from: b */
    public final w3.a<BluetoothGatt> f23007b;

    /* renamed from: c */
    public final w3.a<qc.z> f23008c;

    public j1(w3.a aVar, w3.a aVar2, qc.b0 b0Var) {
        this.f23006a = aVar;
        this.f23007b = aVar2;
        this.f23008c = b0Var;
    }

    @Override // w3.a
    public final Object get() {
        return new e1(this.f23006a.get(), this.f23007b.get(), this.f23008c.get());
    }
}
