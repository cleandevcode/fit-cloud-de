package yc;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f */
    public static final UUID f31440f;

    /* renamed from: a */
    public BluetoothDevice f31441a;

    /* renamed from: b */
    public BluetoothSocket f31442b;

    /* renamed from: c */
    public UUID f31443c;

    /* renamed from: d */
    public boolean f31444d;

    /* renamed from: e */
    public int f31445e;

    static {
        UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
        f31440f = UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");
    }

    public d(BluetoothDevice bluetoothDevice, BluetoothSocket bluetoothSocket, UUID uuid, boolean z10, int i10) {
        this.f31441a = bluetoothDevice;
        this.f31442b = bluetoothSocket;
        this.f31443c = uuid;
        this.f31444d = z10;
        this.f31445e = i10;
    }

    public final ed.d a() {
        BluetoothDevice bluetoothDevice = this.f31441a;
        UUID uuid = ed.d.f13557g;
        BluetoothSocket bluetoothSocket = this.f31442b;
        UUID uuid2 = this.f31443c;
        if (uuid2 == null) {
            uuid2 = uuid;
        }
        return new ed.d(bluetoothDevice, bluetoothSocket, uuid2, this.f31444d, this.f31445e);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ConnectionParameters{\n");
        if (this.f31441a != null) {
            a10.append("\n\tdevice:");
            a10.append(p.b.m(this.f31441a.getAddress()));
        }
        if (this.f31443c != null) {
            a10.append("\n\tuuid:");
            a10.append(this.f31443c.toString());
        }
        a10.append("\n\tfreshUuid:");
        a10.append(this.f31444d);
        a10.append("\n}");
        return a10.toString();
    }
}
