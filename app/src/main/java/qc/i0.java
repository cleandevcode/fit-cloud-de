package qc;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends ScanCallback {

    /* renamed from: a */
    public final /* synthetic */ j0 f24718a;

    public i0(j0 j0Var) {
        this.f24718a = j0Var;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List<ScanResult> list) {
        tk.j<rc.q> jVar;
        for (ScanResult scanResult : list) {
            rc.h hVar = this.f24718a.f24720b;
            hVar.getClass();
            rc.q qVar = new rc.q(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new rc.x(scanResult.getScanRecord(), hVar.f25483a), 4, hVar.f25484b.a(scanResult));
            if (this.f24718a.f24723e.a(qVar) && (jVar = this.f24718a.f24725g) != null) {
                ((g.a) jVar).d(qVar);
            }
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i10) {
        tk.j<rc.q> jVar = this.f24718a.f24725g;
        if (jVar != null) {
            int i11 = 5;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                RxBleLog.w("Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback", new Object[0]);
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 9;
                            }
                        } else {
                            i11 = 8;
                        }
                    } else {
                        i11 = 7;
                    }
                } else {
                    i11 = 6;
                }
            }
            ((g.a) jVar).f(new lc.n(i11));
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i10, ScanResult scanResult) {
        int i11;
        tk.j<rc.q> jVar;
        byte[] bArr;
        if (!this.f24718a.f24723e.f25478b && RxBleLog.isAtLeast(3) && RxBleLog.getShouldLogScannedPeripherals()) {
            ScanRecord scanRecord = scanResult.getScanRecord();
            Object[] objArr = new Object[4];
            objArr[0] = pc.b.c(scanResult.getDevice().getAddress());
            objArr[1] = scanResult.getDevice().getName();
            objArr[2] = Integer.valueOf(scanResult.getRssi());
            if (scanRecord != null) {
                bArr = scanRecord.getBytes();
            } else {
                bArr = null;
            }
            objArr[3] = pc.b.a(bArr);
            RxBleLog.d("%s, name=%s, rssi=%d, data=%s", objArr);
        }
        rc.h hVar = this.f24718a.f24720b;
        hVar.getClass();
        rc.x xVar = new rc.x(scanResult.getScanRecord(), hVar.f25483a);
        BluetoothDevice device = scanResult.getDevice();
        int rssi = scanResult.getRssi();
        long timestampNanos = scanResult.getTimestampNanos();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    RxBleLog.w("Unknown callback type %d -> check android.bluetooth.le.ScanSettings", Integer.valueOf(i10));
                    i11 = 6;
                } else {
                    i11 = 3;
                }
            } else {
                i11 = 2;
            }
        } else {
            i11 = 1;
        }
        rc.q qVar = new rc.q(device, rssi, timestampNanos, xVar, i11, hVar.f25484b.a(scanResult));
        if (this.f24718a.f24723e.a(qVar) && (jVar = this.f24718a.f24725g) != null) {
            ((g.a) jVar).d(qVar);
        }
    }
}
