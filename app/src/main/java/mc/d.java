package mc;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import rc.t;
import tc.d0;
import tc.l0;

/* loaded from: classes.dex */
public final class d implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f20422a;

    /* renamed from: b */
    public final w3.a f20423b;

    /* renamed from: c */
    public final w3.a f20424c;

    public /* synthetic */ d(int i10, w3.a aVar, w3.a aVar2) {
        this.f20422a = i10;
        this.f20423b = aVar;
        this.f20424c = aVar2;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f20422a) {
            case 0:
                String str = (String) this.f20423b.get();
                BluetoothAdapter bluetoothAdapter = ((l0) this.f20424c.get()).f28001a;
                if (bluetoothAdapter != null) {
                    BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
                    b0.c.j(remoteDevice);
                    return remoteDevice;
                }
                throw l0.f28000b;
            case 1:
                return new t((l0) this.f20423b.get(), (d0) this.f20424c.get());
            default:
                return new tc.p((tc.o) this.f20423b.get(), (String[][]) this.f20424c.get());
        }
    }
}
