package rc;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v implements uc.d {

    /* renamed from: a */
    public final List<ParcelUuid> f25509a;

    /* renamed from: b */
    public final List<ParcelUuid> f25510b;

    /* renamed from: c */
    public final SparseArray<byte[]> f25511c;

    /* renamed from: d */
    public final Map<ParcelUuid, byte[]> f25512d;

    /* renamed from: e */
    public final String f25513e;

    /* renamed from: f */
    public final byte[] f25514f;

    public v(ArrayList arrayList, ArrayList arrayList2, SparseArray sparseArray, HashMap hashMap, String str, byte[] bArr) {
        this.f25509a = arrayList;
        this.f25510b = arrayList2;
        this.f25511c = sparseArray;
        this.f25512d = hashMap;
        this.f25513e = str;
        this.f25514f = bArr;
    }

    @Override // uc.d
    public final byte[] a(int i10) {
        return this.f25511c.get(i10);
    }

    @Override // uc.d
    public final List<ParcelUuid> b() {
        return this.f25510b;
    }

    @Override // uc.d
    public final SparseArray<byte[]> c() {
        return this.f25511c;
    }

    @Override // uc.d
    public final String d() {
        return this.f25513e;
    }

    @Override // uc.d
    public final List<ParcelUuid> e() {
        return this.f25509a;
    }

    @Override // uc.d
    public final byte[] f(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return this.f25512d.get(parcelUuid);
    }

    @Override // uc.d
    public final byte[] getBytes() {
        return this.f25514f;
    }
}
