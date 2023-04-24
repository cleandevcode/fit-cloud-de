package qc;

import a0.a2;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 extends f0<rc.q, ScanCallback> {

    /* renamed from: b */
    public final rc.h f24720b;

    /* renamed from: c */
    public final rc.d f24721c;

    /* renamed from: d */
    public final uc.f f24722d;

    /* renamed from: e */
    public final rc.g f24723e;

    /* renamed from: f */
    public final uc.c[] f24724f;

    /* renamed from: g */
    public tk.j<rc.q> f24725g;

    public j0(tc.l0 l0Var, rc.h hVar, rc.d dVar, uc.f fVar, rc.g gVar, uc.c[] cVarArr) {
        super(l0Var);
        this.f24720b = hVar;
        this.f24722d = fVar;
        this.f24723e = gVar;
        this.f24724f = cVarArr;
        this.f24721c = dVar;
        this.f24725g = null;
    }

    @Override // qc.f0
    public final Object d(g.a aVar) {
        this.f24725g = aVar;
        return new i0(this);
    }

    @Override // qc.f0
    public final boolean e(tc.l0 l0Var, ScanCallback scanCallback) {
        boolean z10;
        ArrayList arrayList;
        ScanSettings.Builder callbackType;
        ScanSettings.Builder matchMode;
        ScanCallback scanCallback2 = scanCallback;
        if (this.f24723e.f25478b) {
            RxBleLog.d("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        rc.d dVar = this.f24721c;
        uc.c[] cVarArr = this.f24724f;
        dVar.getClass();
        if (cVarArr != null && cVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = new ArrayList(cVarArr.length);
            for (uc.c cVar : cVarArr) {
                ScanFilter.Builder builder = new ScanFilter.Builder();
                ParcelUuid parcelUuid = cVar.f28662g;
                if (parcelUuid != null) {
                    builder.setServiceData(parcelUuid, cVar.f28663h, cVar.f28664i);
                }
                String str = cVar.f28657b;
                if (str != null) {
                    builder.setDeviceAddress(str);
                }
                arrayList.add(builder.setDeviceName(cVar.f28656a).setManufacturerData(cVar.f28665j, cVar.f28666k, cVar.f28667l).setServiceUuid(cVar.f28658c, cVar.f28659d).build());
            }
        } else {
            arrayList = null;
        }
        rc.d dVar2 = this.f24721c;
        uc.f fVar = this.f24722d;
        dVar2.getClass();
        ScanSettings.Builder builder2 = new ScanSettings.Builder();
        if (dVar2.f25464a >= 23) {
            callbackType = builder2.setCallbackType(fVar.f28675b);
            matchMode = callbackType.setMatchMode(fVar.f28677d);
            matchMode.setNumOfMatches(fVar.f28678e);
            if (dVar2.f25464a >= 26) {
                builder2.setLegacy(fVar.f28679f);
            }
        }
        ScanSettings build = builder2.setReportDelay(fVar.f28676c).setScanMode(fVar.f28674a).build();
        BluetoothAdapter bluetoothAdapter = l0Var.f28001a;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.getBluetoothLeScanner().startScan(arrayList, build, scanCallback2);
            return true;
        }
        throw tc.l0.f28000b;
    }

    @Override // qc.f0
    public final void f(tc.l0 l0Var, ScanCallback scanCallback) {
        ScanCallback scanCallback2 = scanCallback;
        BluetoothAdapter bluetoothAdapter = l0Var.f28001a;
        if (bluetoothAdapter != null) {
            if (!bluetoothAdapter.isEnabled()) {
                RxBleLog.v("BluetoothAdapter is disabled, calling BluetoothLeScanner.stopScan(ScanCallback) may cause IllegalStateException", new Object[0]);
            } else {
                BluetoothLeScanner bluetoothLeScanner = l0Var.f28001a.getBluetoothLeScanner();
                if (bluetoothLeScanner == null) {
                    RxBleLog.w("Cannot call BluetoothLeScanner.stopScan(ScanCallback) on 'null' reference; BluetoothAdapter.isEnabled() == %b", Boolean.valueOf(l0Var.f28001a.isEnabled()));
                } else {
                    bluetoothLeScanner.stopScan(scanCallback2);
                }
            }
            tk.j<rc.q> jVar = this.f24725g;
            if (jVar != null) {
                ((g.a) jVar).b();
                this.f24725g = null;
                return;
            }
            return;
        }
        throw tc.l0.f28000b;
    }

    public final String toString() {
        boolean z10;
        String sb2;
        String str;
        uc.c[] cVarArr = this.f24724f;
        if (cVarArr != null && cVarArr.length != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = this.f24723e.f25478b;
        StringBuilder a10 = android.support.v4.media.d.a("ScanOperationApi21{");
        String str2 = "";
        if (z10) {
            sb2 = "";
        } else {
            StringBuilder a11 = android.support.v4.media.d.a("ANY_MUST_MATCH -> nativeFilters=");
            a11.append(Arrays.toString(this.f24724f));
            sb2 = a11.toString();
        }
        a10.append(sb2);
        if (z10 || z11) {
            str = "";
        } else {
            str = " and then ";
        }
        a10.append(str);
        if (!z11) {
            StringBuilder a12 = android.support.v4.media.d.a("ANY_MUST_MATCH -> ");
            a12.append(this.f24723e);
            str2 = a12.toString();
        }
        return a2.a(a10, str2, '}');
    }
}
