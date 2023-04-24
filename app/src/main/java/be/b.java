package be;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public BluetoothDevice f4151a;

    /* renamed from: b */
    public String f4152b;

    /* renamed from: c */
    public byte[] f4153c;

    public b(BluetoothDevice bluetoothDevice, String str, byte[] bArr) {
        ArrayList arrayList;
        this.f4151a = bluetoothDevice;
        this.f4152b = str;
        this.f4153c = bArr;
        e b10 = e.b(bArr);
        if (b10 != null && (arrayList = b10.f4174b) != null) {
            arrayList.contains(de.a.f13016a);
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof b ? this.f4151a.getAddress().equals(((b) obj).f4151a.getAddress()) : super.equals(obj);
    }
}
