package oc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements wk.a {

    /* renamed from: a */
    public final /* synthetic */ BluetoothGatt f23052a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothGattCharacteristic f23053b;

    /* renamed from: c */
    public final /* synthetic */ boolean f23054c;

    public /* synthetic */ v0(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        this.f23052a = bluetoothGatt;
        this.f23053b = bluetoothGattCharacteristic;
        this.f23054c = z10;
    }

    @Override // wk.a
    public final void run() {
        BluetoothGatt bluetoothGatt = this.f23052a;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f23053b;
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, this.f23054c)) {
            throw new lc.c(bluetoothGattCharacteristic, 1, null);
        }
    }
}
