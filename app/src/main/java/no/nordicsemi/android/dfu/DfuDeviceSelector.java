package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes2.dex */
public interface DfuDeviceSelector {
    boolean matches(BluetoothDevice bluetoothDevice, int i10, byte[] bArr, String str, String str2);
}
