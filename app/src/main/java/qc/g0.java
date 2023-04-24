package qc;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;

/* loaded from: classes.dex */
public final class g0 implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    public final /* synthetic */ tk.j f24710a;

    /* renamed from: b */
    public final /* synthetic */ h0 f24711b;

    public g0(h0 h0Var, g.a aVar) {
        this.f24711b = h0Var;
        this.f24710a = aVar;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public final void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        if (!this.f24711b.f24716c.f25478b && RxBleLog.isAtLeast(3) && RxBleLog.getShouldLogScannedPeripherals()) {
            RxBleLog.d("%s, name=%s, rssi=%d, data=%s", pc.b.c(bluetoothDevice.getAddress()), bluetoothDevice.getName(), Integer.valueOf(i10), pc.b.a(bArr));
        }
        this.f24711b.f24715b.f25483a.getClass();
        rc.q qVar = new rc.q(bluetoothDevice, i10, System.nanoTime(), tc.m0.b(bArr), 5, 1);
        if (this.f24711b.f24716c.a(qVar)) {
            ((g.a) this.f24710a).d(qVar);
        }
    }
}
