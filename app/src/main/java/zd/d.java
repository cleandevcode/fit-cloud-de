package zd;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d */
    public static final UUID f32223d;

    /* renamed from: a */
    public final BluetoothDevice f32224a;

    /* renamed from: b */
    public final BluetoothSocket f32225b;

    /* renamed from: c */
    public final UUID f32226c;

    static {
        UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
        f32223d = UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");
    }

    public d(BluetoothDevice bluetoothDevice, BluetoothSocket bluetoothSocket, UUID uuid) {
        this.f32224a = bluetoothDevice;
        this.f32225b = bluetoothSocket;
        this.f32226c = uuid;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SppConnParameters{");
        if (this.f32224a != null) {
            sb2.append("\n\tdevice:");
            sb2.append(p.b.m(this.f32224a.getAddress()));
        }
        if (this.f32226c != null) {
            sb2.append("\n\tuuid:");
            sb2.append(this.f32226c.toString());
        }
        sb2.append("\n\tfreshUuid:");
        sb2.append(false);
        if (this.f32225b != null) {
            sb2.append("\n\tsocket:");
            sb2.append(this.f32225b.getRemoteDevice());
        }
        sb2.append("\n}");
        return sb2.toString();
    }
}
