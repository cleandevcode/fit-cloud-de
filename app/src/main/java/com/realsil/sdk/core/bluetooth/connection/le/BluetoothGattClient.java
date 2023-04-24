package com.realsil.sdk.core.bluetooth.connection.le;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import androidx.annotation.Keep;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import java.util.UUID;
import vd.e;
import yd.c;

/* loaded from: classes.dex */
public class BluetoothGattClient extends BluetoothClient {
    @Keep
    public BluetoothGatt mBluetoothGatt;
    @Keep
    public String mDeviceAddress = null;
    @Keep
    public c mGattConnParams;
    @Keep
    public vd.c mGlobalGatt;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            BluetoothGattClient.this = r1;
        }

        @Override // vd.e
        public final void b(int i10, BluetoothDevice bluetoothDevice) {
            BluetoothGattClient.this.getClass();
        }
    }

    static {
        UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    }

    public BluetoothGattClient() {
        new a();
    }
}
