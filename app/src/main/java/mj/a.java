package mj;

import bi.m0;
import bi.r;
import gm.l;
import java.util.Arrays;
import nj.c;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a */
    public final int f21877a;

    /* renamed from: b */
    public final byte[] f21878b;

    /* renamed from: mj.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0386a {

        /* renamed from: a */
        public final int f21879a;

        /* renamed from: b */
        public final byte[] f21880b;

        public AbstractC0386a(int i10, byte[] bArr) {
            this.f21879a = i10;
            this.f21880b = (bArr == null || bArr.length != i10) ? new byte[i10] : bArr;
        }

        public final void a(int i10, boolean z10) {
            m0.B(this.f21880b, this.f21879a - 1, i10, z10);
        }
    }

    public a(int i10, byte[] bArr) {
        this.f21877a = i10;
        this.f21878b = (bArr == null || bArr.length != i10) ? null : null;
    }

    public final byte[] a() {
        byte[] bArr = this.f21878b;
        if (bArr != null) {
            if (bArr.length == 0) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return null;
    }

    public final String b(int i10, int i11) {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            bArr = new byte[i11];
        } else if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        String C = r.C(bArr);
        l.e(C, "internalBytes2HexStr(byteArray)");
        return C;
    }

    public byte[] c(c cVar) {
        l.f(cVar, "deviceInfo");
        byte[] bArr = this.f21878b;
        return bArr == null ? new byte[this.f21877a] : bArr;
    }

    public final boolean d(int i10) {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return false;
        }
        return m0.x(bArr, this.f21877a - 1, i10);
    }

    public final boolean e() {
        return this.f21878b == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (l.a(getClass(), obj != null ? obj.getClass() : null)) {
            l.d(obj, "null cannot be cast to non-null type com.topstep.fitcloud.sdk.v2.model.BytesModel");
            byte[] bArr = this.f21878b;
            byte[] bArr2 = ((a) obj).f21878b;
            if (bArr != null) {
                if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                    return false;
                }
            } else if (bArr2 != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.f21878b;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    public final String toString() {
        return b(0, this.f21877a);
    }
}
