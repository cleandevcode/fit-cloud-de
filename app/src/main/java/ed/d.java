package ed;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.ParcelUuid;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f */
    public static final ParcelUuid f13556f = ParcelUuid.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: g */
    public static final UUID f13557g = UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");

    /* renamed from: a */
    public BluetoothDevice f13558a;

    /* renamed from: b */
    public BluetoothSocket f13559b;

    /* renamed from: c */
    public UUID f13560c;

    /* renamed from: d */
    public boolean f13561d;

    /* renamed from: e */
    public int f13562e;

    public d(BluetoothDevice bluetoothDevice, BluetoothSocket bluetoothSocket, UUID uuid, boolean z10, int i10) {
        this.f13558a = bluetoothDevice;
        this.f13559b = bluetoothSocket;
        this.f13560c = uuid;
        this.f13561d = z10;
        this.f13562e = i10;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ConnectionParameters{\n");
        if (this.f13558a != null) {
            a10.append("\n\tdevice:");
            a10.append(p.b.m(this.f13558a.getAddress()));
        }
        UUID uuid = this.f13560c;
        if (uuid != null) {
            a10.append(String.format(Locale.US, "\n\tuuid:%s, fresh=%b, transport=%d", uuid.toString(), Boolean.valueOf(this.f13561d), Integer.valueOf(this.f13562e)));
        }
        a10.append("\n}");
        return a10.toString();
    }
}
