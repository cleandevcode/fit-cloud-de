package oc;

import android.bluetooth.BluetoothGatt;
import kc.l;
import kc.m;
import kc.n;

/* loaded from: classes.dex */
public final class y0 implements v3.c<x0> {

    /* renamed from: a */
    public final w3.a<byte[]> f23070a;

    /* renamed from: b */
    public final w3.a<byte[]> f23071b;

    /* renamed from: c */
    public final w3.a<byte[]> f23072c;

    /* renamed from: d */
    public final w3.a<BluetoothGatt> f23073d;

    /* renamed from: e */
    public final w3.a<c1> f23074e;

    /* renamed from: f */
    public final w3.a<s> f23075f;

    public y0(w3.a aVar, w3.a aVar2, w3.a aVar3) {
        kc.n nVar = n.a.f18359a;
        kc.m mVar = m.a.f18350a;
        kc.l lVar = l.a.f18347a;
        this.f23070a = nVar;
        this.f23071b = mVar;
        this.f23072c = lVar;
        this.f23073d = aVar;
        this.f23074e = aVar2;
        this.f23075f = aVar3;
    }

    @Override // w3.a
    public final Object get() {
        return new x0(this.f23070a.get(), this.f23071b.get(), this.f23072c.get(), this.f23073d.get(), this.f23074e.get(), this.f23075f.get());
    }
}
