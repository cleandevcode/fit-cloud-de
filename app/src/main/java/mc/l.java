package mc;

import a0.a2;
import android.bluetooth.BluetoothDevice;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kc.a0;
import kc.v0;
import kc.w0;
import kc.z0;

/* loaded from: classes.dex */
public final class l implements w0 {

    /* renamed from: a */
    public final BluetoothDevice f20436a;

    /* renamed from: b */
    public final oc.m f20437b;

    /* renamed from: c */
    public final tc.l f20438c;

    /* renamed from: d */
    public final AtomicBoolean f20439d = new AtomicBoolean(false);

    public l(BluetoothDevice bluetoothDevice, oc.m mVar, tc.l lVar) {
        this.f20436a = bluetoothDevice;
        this.f20437b = mVar;
        this.f20438c = lVar;
    }

    @Override // kc.w0
    public final tk.i<v0> a(boolean z10) {
        return new bl.k(1, new j(this, new a0(z10, true, new z0(TimeUnit.SECONDS)), 0));
    }

    @Override // kc.w0
    public final BluetoothDevice b() {
        return this.f20436a;
    }

    @Override // kc.w0
    public final String c() {
        return this.f20436a.getAddress();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f20436a.equals(((l) obj).f20436a);
        }
        return false;
    }

    @Override // kc.w0
    public final String getName() {
        return this.f20436a.getName();
    }

    public final int hashCode() {
        return this.f20436a.hashCode();
    }

    public final String toString() {
        String name;
        StringBuilder a10 = android.support.v4.media.d.a("RxBleDeviceImpl{");
        a10.append(pc.b.c(this.f20436a.getAddress()));
        a10.append(", name=");
        tc.l lVar = this.f20438c;
        boolean z10 = true;
        for (String[] strArr : lVar.f27999b) {
            z10 &= lVar.f27998a.a(strArr);
        }
        if (!z10) {
            name = "[NO BLUETOOTH_CONNECT PERMISSION]";
        } else {
            name = this.f20436a.getName();
        }
        return a2.a(a10, name, '}');
    }
}
