package ln;

import bi.m0;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class v extends h {

    /* renamed from: e */
    public final transient byte[][] f20141e;

    /* renamed from: f */
    public final transient int[] f20142f;

    public v(byte[][] bArr, int[] iArr) {
        super(h.f20100d.f20103c);
        this.f20141e = bArr;
        this.f20142f = iArr;
    }

    private final Object writeReplace() {
        return new h(m());
    }

    @Override // ln.h
    public final String a() {
        throw null;
    }

    @Override // ln.h
    public final h c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.f20141e.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f20142f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(this.f20141e[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        gm.l.e(digest, "digestBytes");
        return new h(digest);
    }

    @Override // ln.h
    public final int d() {
        return this.f20142f[this.f20141e.length - 1];
    }

    @Override // ln.h
    public final String e() {
        return new h(m()).e();
    }

    @Override // ln.h
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (hVar.d() != d() || !i(hVar, d())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // ln.h
    public final byte[] f() {
        return m();
    }

    @Override // ln.h
    public final byte g(int i10) {
        int i11;
        m0.g(this.f20142f[this.f20141e.length - 1], i10, 1L);
        int b10 = gm.f.b(this, i10);
        if (b10 == 0) {
            i11 = 0;
        } else {
            i11 = this.f20142f[b10 - 1];
        }
        int[] iArr = this.f20142f;
        byte[][] bArr = this.f20141e;
        return bArr[b10][(i10 - i11) + iArr[bArr.length + b10]];
    }

    @Override // ln.h
    public final boolean h(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        gm.l.f(bArr, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int b10 = gm.f.b(this, i10);
        while (i10 < i14) {
            if (b10 == 0) {
                i13 = 0;
            } else {
                i13 = this.f20142f[b10 - 1];
            }
            int[] iArr = this.f20142f;
            int i15 = iArr[this.f20141e.length + b10];
            int min = Math.min(i14, (iArr[b10] - i13) + i13) - i10;
            if (!m0.d((i10 - i13) + i15, i11, min, this.f20141e[b10], bArr)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // ln.h
    public final int hashCode() {
        int i10 = this.f20101a;
        if (i10 == 0) {
            int length = this.f20141e.length;
            int i11 = 0;
            int i12 = 1;
            int i13 = 0;
            while (i11 < length) {
                int[] iArr = this.f20142f;
                int i14 = iArr[length + i11];
                int i15 = iArr[i11];
                byte[] bArr = this.f20141e[i11];
                int i16 = (i15 - i13) + i14;
                while (i14 < i16) {
                    i12 = (i12 * 31) + bArr[i14];
                    i14++;
                }
                i11++;
                i13 = i15;
            }
            this.f20101a = i12;
            return i12;
        }
        return i10;
    }

    @Override // ln.h
    public final boolean i(h hVar, int i10) {
        int i11;
        gm.l.f(hVar, "other");
        if (d() - i10 < 0) {
            return false;
        }
        int i12 = i10 + 0;
        int b10 = gm.f.b(this, 0);
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            if (b10 == 0) {
                i11 = 0;
            } else {
                i11 = this.f20142f[b10 - 1];
            }
            int[] iArr = this.f20142f;
            int i15 = iArr[this.f20141e.length + b10];
            int min = Math.min(i12, (iArr[b10] - i11) + i11) - i13;
            if (!hVar.h(i14, (i13 - i11) + i15, min, this.f20141e[b10])) {
                return false;
            }
            i14 += min;
            i13 += min;
            b10++;
        }
        return true;
    }

    @Override // ln.h
    public final h j() {
        return new h(m()).j();
    }

    @Override // ln.h
    public final void l(e eVar, int i10) {
        int i11;
        gm.l.f(eVar, "buffer");
        int i12 = 0 + i10;
        int b10 = gm.f.b(this, 0);
        int i13 = 0;
        while (i13 < i12) {
            if (b10 == 0) {
                i11 = 0;
            } else {
                i11 = this.f20142f[b10 - 1];
            }
            int[] iArr = this.f20142f;
            int i14 = iArr[this.f20141e.length + b10];
            int min = Math.min(i12, (iArr[b10] - i11) + i11) - i13;
            int i15 = (i13 - i11) + i14;
            t tVar = new t(i15, i15 + min, true, this.f20141e[b10]);
            t tVar2 = eVar.f20097a;
            if (tVar2 == null) {
                tVar.f20137g = tVar;
                tVar.f20136f = tVar;
                eVar.f20097a = tVar;
            } else {
                t tVar3 = tVar2.f20137g;
                gm.l.c(tVar3);
                tVar3.b(tVar);
            }
            i13 += min;
            b10++;
        }
        eVar.f20098b += i10;
    }

    public final byte[] m() {
        byte[] bArr = new byte[d()];
        int length = this.f20141e.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f20142f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            ul.i.v(i12, i13, i13 + i15, this.f20141e[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // ln.h
    public final String toString() {
        return new h(m()).toString();
    }
}
