package qc;

import android.bluetooth.BluetoothManager;
import oc.c1;

/* loaded from: classes.dex */
public final class w implements v3.c<v> {

    /* renamed from: a */
    public final w3.a<c1> f24777a;

    /* renamed from: b */
    public final w3.a<oc.a> f24778b;

    /* renamed from: c */
    public final w3.a<String> f24779c;

    /* renamed from: d */
    public final w3.a<BluetoothManager> f24780d;

    /* renamed from: e */
    public final w3.a<tk.o> f24781e;

    /* renamed from: f */
    public final w3.a<m0> f24782f;

    /* renamed from: g */
    public final w3.a<oc.k> f24783g;

    public w(w3.a aVar, w3.a aVar2, v3.d dVar, kc.g gVar, w3.a aVar3, mc.g gVar2, w3.a aVar4) {
        this.f24777a = aVar;
        this.f24778b = aVar2;
        this.f24779c = dVar;
        this.f24780d = gVar;
        this.f24781e = aVar3;
        this.f24782f = gVar2;
        this.f24783g = aVar4;
    }

    @Override // w3.a
    public final Object get() {
        return new v(this.f24777a.get(), this.f24778b.get(), this.f24779c.get(), this.f24780d.get(), this.f24781e.get(), this.f24782f.get(), this.f24783g.get());
    }
}
