package oc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: h */
    public static final UUID f23059h = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: a */
    public final byte[] f23060a;

    /* renamed from: b */
    public final byte[] f23061b;

    /* renamed from: c */
    public final byte[] f23062c;

    /* renamed from: d */
    public final BluetoothGatt f23063d;

    /* renamed from: e */
    public final c1 f23064e;

    /* renamed from: f */
    public final s f23065f;

    /* renamed from: g */
    public final HashMap f23066g = new HashMap();

    public x0(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, c1 c1Var, s sVar) {
        this.f23060a = bArr;
        this.f23061b = bArr2;
        this.f23062c = bArr3;
        this.f23063d = bluetoothGatt;
        this.f23064e = c1Var;
        this.f23065f = sVar;
    }

    public static tk.a a(BluetoothGattCharacteristic bluetoothGattCharacteristic, s sVar, byte[] bArr) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f23059h);
        if (descriptor == null) {
            return new bl.c(new lc.c(bluetoothGattCharacteristic, 2, null));
        }
        tk.i a10 = sVar.f23033a.a(sVar.f23034b.b(descriptor, bArr));
        a10.getClass();
        return new bl.i(new fl.d0(a10), new ph.p(13, bluetoothGattCharacteristic));
    }
}
