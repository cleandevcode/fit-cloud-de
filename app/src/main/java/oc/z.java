package oc;

import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes.dex */
public final class z implements wk.a {

    /* renamed from: a */
    public final /* synthetic */ BluetoothGattCharacteristic f23076a;

    /* renamed from: b */
    public final /* synthetic */ int f23077b;

    /* renamed from: c */
    public final /* synthetic */ a0 f23078c;

    public z(a0 a0Var, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        this.f23078c = a0Var;
        this.f23076a = bluetoothGattCharacteristic;
        this.f23077b = i10;
    }

    @Override // wk.a
    public final void run() {
        mc.a a10;
        int properties = this.f23076a.getProperties();
        int i10 = this.f23077b;
        if ((properties & i10) == 0 && (a10 = this.f23078c.f22919a.a(this.f23076a, i10)) != null) {
            throw a10;
        }
    }
}
