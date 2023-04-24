package oc;

import android.bluetooth.BluetoothAdapter;

/* loaded from: classes.dex */
public final class h0 implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f22985a;

    /* renamed from: b */
    public final w3.a f22986b;

    public /* synthetic */ h0(v3.c cVar, int i10) {
        this.f22985a = i10;
        this.f22986b = cVar;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f22985a) {
            case 0:
                return new g0((d0) this.f22986b.get());
            default:
                return new tc.l0((BluetoothAdapter) this.f22986b.get());
        }
    }
}
