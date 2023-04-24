package qc;

import a0.a2;
import android.bluetooth.BluetoothAdapter;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;

/* loaded from: classes.dex */
public final class h0 extends f0<rc.q, BluetoothAdapter.LeScanCallback> {

    /* renamed from: b */
    public final rc.h f24715b;

    /* renamed from: c */
    public final rc.g f24716c;

    public h0(tc.l0 l0Var, rc.h hVar, rc.g gVar) {
        super(l0Var);
        this.f24715b = hVar;
        this.f24716c = gVar;
    }

    @Override // qc.f0
    public final Object d(g.a aVar) {
        return new g0(this, aVar);
    }

    @Override // qc.f0
    public final boolean e(tc.l0 l0Var, BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter.LeScanCallback leScanCallback2 = leScanCallback;
        if (this.f24716c.f25478b) {
            RxBleLog.d("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        BluetoothAdapter bluetoothAdapter = l0Var.f28001a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.startLeScan(leScanCallback2);
        }
        throw tc.l0.f28000b;
    }

    @Override // qc.f0
    public final void f(tc.l0 l0Var, BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter.LeScanCallback leScanCallback2 = leScanCallback;
        BluetoothAdapter bluetoothAdapter = l0Var.f28001a;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(leScanCallback2);
            return;
        }
        throw tc.l0.f28000b;
    }

    public final String toString() {
        String sb2;
        StringBuilder a10 = android.support.v4.media.d.a("ScanOperationApi18{");
        if (this.f24716c.f25478b) {
            sb2 = "";
        } else {
            StringBuilder a11 = android.support.v4.media.d.a("ANY_MUST_MATCH -> ");
            a11.append(this.f24716c);
            sb2 = a11.toString();
        }
        return a2.a(a10, sb2, '}');
    }
}
