package rc;

import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import tc.m0;

/* loaded from: classes.dex */
public final class x implements uc.d {

    /* renamed from: a */
    public final ScanRecord f25515a;

    /* renamed from: b */
    public final m0 f25516b;

    public x(ScanRecord scanRecord, m0 m0Var) {
        this.f25515a = scanRecord;
        this.f25516b = m0Var;
    }

    @Override // uc.d
    public final byte[] a(int i10) {
        return this.f25515a.getManufacturerSpecificData(i10);
    }

    @Override // uc.d
    public final List<ParcelUuid> b() {
        List<ParcelUuid> serviceSolicitationUuids;
        if (Build.VERSION.SDK_INT >= 29) {
            serviceSolicitationUuids = this.f25515a.getServiceSolicitationUuids();
            return serviceSolicitationUuids;
        }
        m0 m0Var = this.f25516b;
        byte[] bytes = this.f25515a.getBytes();
        m0Var.getClass();
        return m0.b(bytes).f25510b;
    }

    @Override // uc.d
    public final SparseArray<byte[]> c() {
        return this.f25515a.getManufacturerSpecificData();
    }

    @Override // uc.d
    public final String d() {
        return this.f25515a.getDeviceName();
    }

    @Override // uc.d
    public final List<ParcelUuid> e() {
        return this.f25515a.getServiceUuids();
    }

    @Override // uc.d
    public final byte[] f(ParcelUuid parcelUuid) {
        return this.f25515a.getServiceData(parcelUuid);
    }

    @Override // uc.d
    public final byte[] getBytes() {
        return this.f25515a.getBytes();
    }
}
