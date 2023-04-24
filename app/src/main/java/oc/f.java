package oc;

import android.bluetooth.BluetoothGatt;
import android.content.Context;

/* loaded from: classes.dex */
public final class f implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f22977a;

    /* renamed from: b */
    public final w3.a f22978b;

    public /* synthetic */ f(w3.a aVar, int i10) {
        this.f22977a = i10;
        this.f22978b = aVar;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f22977a) {
            case 0:
                BluetoothGatt bluetoothGatt = ((a) this.f22978b.get()).f22918a.get();
                b0.c.j(bluetoothGatt);
                return bluetoothGatt;
            case 1:
                return new rc.d(((Integer) this.f22978b.get()).intValue());
            default:
                return new tc.o((Context) this.f22978b.get());
        }
    }
}
