package oc;

import android.bluetooth.BluetoothGatt;
import kc.v0;

/* loaded from: classes.dex */
public final class b1 implements v3.c<a1> {

    /* renamed from: a */
    public final w3.a<sc.d> f22930a;

    /* renamed from: b */
    public final w3.a<c1> f22931b;

    /* renamed from: c */
    public final w3.a<BluetoothGatt> f22932c;

    /* renamed from: d */
    public final w3.a<e1> f22933d;

    /* renamed from: e */
    public final w3.a<x0> f22934e;

    /* renamed from: f */
    public final w3.a<m0> f22935f;

    /* renamed from: g */
    public final w3.a<s> f22936g;

    /* renamed from: h */
    public final w3.a<qc.z> f22937h;

    /* renamed from: i */
    public final w3.a<v0.a> f22938i;

    /* renamed from: j */
    public final w3.a<tk.o> f22939j;

    /* renamed from: k */
    public final w3.a<a0> f22940k;

    public b1(w3.a<sc.d> aVar, w3.a<c1> aVar2, w3.a<BluetoothGatt> aVar3, w3.a<e1> aVar4, w3.a<x0> aVar5, w3.a<m0> aVar6, w3.a<s> aVar7, w3.a<qc.z> aVar8, w3.a<v0.a> aVar9, w3.a<tk.o> aVar10, w3.a<a0> aVar11) {
        this.f22930a = aVar;
        this.f22931b = aVar2;
        this.f22932c = aVar3;
        this.f22933d = aVar4;
        this.f22934e = aVar5;
        this.f22935f = aVar6;
        this.f22936g = aVar7;
        this.f22937h = aVar8;
        this.f22938i = aVar9;
        this.f22939j = aVar10;
        this.f22940k = aVar11;
    }

    @Override // w3.a
    public final Object get() {
        sc.d dVar = this.f22930a.get();
        this.f22931b.get();
        this.f22932c.get();
        e1 e1Var = this.f22933d.get();
        x0 x0Var = this.f22934e.get();
        m0 m0Var = this.f22935f.get();
        this.f22936g.get();
        qc.z zVar = this.f22937h.get();
        w3.a<v0.a> aVar = this.f22938i;
        this.f22939j.get();
        return new a1(dVar, e1Var, x0Var, m0Var, zVar, aVar, this.f22940k.get());
    }
}
