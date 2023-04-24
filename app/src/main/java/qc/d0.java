package qc;

import android.bluetooth.BluetoothGatt;
import oc.c1;

/* loaded from: classes.dex */
public final class d0 implements v3.c<c0> {

    /* renamed from: a */
    public final w3.a<c1> f24702a;

    /* renamed from: b */
    public final w3.a<BluetoothGatt> f24703b;

    /* renamed from: c */
    public final w3.a<m0> f24704c;

    public d0(w3.a aVar, w3.a aVar2, oc.i iVar) {
        this.f24702a = aVar;
        this.f24703b = aVar2;
        this.f24704c = iVar;
    }

    @Override // w3.a
    public final Object get() {
        return new c0(this.f24702a.get(), this.f24703b.get(), this.f24704c.get());
    }
}
