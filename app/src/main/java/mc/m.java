package mc;

import android.bluetooth.BluetoothDevice;
import kc.v0;

/* loaded from: classes.dex */
public final class m implements v3.c<l> {

    /* renamed from: a */
    public final w3.a<BluetoothDevice> f20440a;

    /* renamed from: b */
    public final w3.a<oc.m> f20441b;

    /* renamed from: c */
    public final w3.a<gc.b<v0.b>> f20442c;

    /* renamed from: d */
    public final w3.a<tc.l> f20443d;

    public m(w3.a<BluetoothDevice> aVar, w3.a<oc.m> aVar2, w3.a<gc.b<v0.b>> aVar3, w3.a<tc.l> aVar4) {
        this.f20440a = aVar;
        this.f20441b = aVar2;
        this.f20442c = aVar3;
        this.f20443d = aVar4;
    }

    @Override // w3.a
    public final Object get() {
        this.f20442c.get();
        return new l(this.f20440a.get(), this.f20441b.get(), this.f20443d.get());
    }
}
