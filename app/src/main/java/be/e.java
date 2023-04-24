package be;

import android.os.ParcelUuid;
import android.util.ArrayMap;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final int f4173a;

    /* renamed from: b */
    public final ArrayList f4174b;

    /* renamed from: c */
    public final SparseArray<byte[]> f4175c;

    /* renamed from: d */
    public final Map<ParcelUuid, byte[]> f4176d;

    /* renamed from: e */
    public final int f4177e;

    /* renamed from: f */
    public final String f4178f;

    public e(ArrayList arrayList, SparseArray sparseArray, ArrayMap arrayMap, int i10, int i11, String str) {
        this.f4174b = arrayList;
        this.f4175c = sparseArray;
        this.f4176d = arrayMap;
        this.f4178f = str;
        this.f4173a = i10;
        this.f4177e = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static be.e b(byte[] r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e.b(byte[]):be.e");
    }

    public final byte[] a(int i10) {
        SparseArray<byte[]> sparseArray = this.f4175c;
        if (sparseArray != null) {
            return sparseArray.get(i10);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScanRecord [mAdvertiseFlags=");
        sb2.append(this.f4173a);
        sb2.append(", mServiceUuids=");
        sb2.append(this.f4174b);
        sb2.append("\n, mManufacturerSpecificData=");
        sb2.append(fe.b.a(this.f4175c));
        sb2.append(", mServiceData=");
        sb2.append(fe.b.b(this.f4176d));
        sb2.append(", mTxPowerLevel=");
        sb2.append(this.f4177e);
        sb2.append(", mDeviceName=");
        return androidx.activity.e.b(sb2, this.f4178f, "]");
    }
}
