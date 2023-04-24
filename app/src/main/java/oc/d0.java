package oc;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final tc.k f22962a;

    public d0(tc.k kVar) {
        this.f22962a = kVar;
    }

    public final String a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return String.format(Locale.getDefault(), "Characteristic %s supports properties: %s (%d) does not have any property matching %s (%d)", pc.b.d(bluetoothGattCharacteristic.getUuid()), this.f22962a.a(bluetoothGattCharacteristic.getProperties()), Integer.valueOf(bluetoothGattCharacteristic.getProperties()), this.f22962a.a(i10), Integer.valueOf(i10));
    }
}
