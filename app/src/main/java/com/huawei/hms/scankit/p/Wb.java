package com.huawei.hms.scankit.p;

import java.util.LinkedList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Wb {

    /* renamed from: a */
    public static final Wb f7764a = new Wb(Xb.f7772a, 0, 0, 0);

    /* renamed from: b */
    private final int f7765b;

    /* renamed from: c */
    private final Xb f7766c;

    /* renamed from: d */
    private final int f7767d;

    /* renamed from: e */
    private final int f7768e;

    private Wb(Xb xb2, int i10, int i11, int i12) {
        this.f7766c = xb2;
        this.f7765b = i10;
        this.f7767d = i11;
        this.f7768e = i12;
    }

    public int a() {
        return this.f7767d;
    }

    public Wb a(int i10) {
        Xb xb2 = this.f7766c;
        int i11 = this.f7765b;
        int i12 = this.f7768e;
        if (i11 == 4 || i11 == 2) {
            int i13 = Ub.f7735b[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            xb2 = xb2.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f7767d;
        Wb wb2 = new Wb(xb2, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return wb2.f7767d == 2078 ? wb2.b(i10 + 1) : wb2;
    }

    public Wb a(int i10, int i11) {
        int i12 = this.f7768e;
        Xb xb2 = this.f7766c;
        int i13 = this.f7765b;
        if (i10 != i13) {
            int i14 = Ub.f7735b[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            xb2 = xb2.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new Wb(xb2.a(i11, i17), i10, 0, i12 + i17);
    }

    public C0732x a(byte[] bArr) {
        LinkedList<Xb> linkedList = new LinkedList();
        for (Xb xb2 = b(bArr.length).f7766c; xb2 != null; xb2 = xb2.a()) {
            linkedList.addFirst(xb2);
        }
        C0732x c0732x = new C0732x();
        for (Xb xb3 : linkedList) {
            xb3.a(c0732x, bArr);
        }
        return c0732x;
    }

    public boolean a(Wb wb2) {
        int i10;
        int i11 = this.f7768e + (Ub.f7735b[this.f7765b][wb2.f7765b] >> 16);
        int i12 = wb2.f7767d;
        if (i12 > 0 && ((i10 = this.f7767d) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= wb2.f7768e;
    }

    public int b() {
        return this.f7768e;
    }

    public Wb b(int i10) {
        int i11 = this.f7767d;
        return i11 == 0 ? this : new Wb(this.f7766c.b(i10 - i11, i11), this.f7765b, 0, this.f7768e);
    }

    public Wb b(int i10, int i11) {
        Xb xb2 = this.f7766c;
        int i12 = this.f7765b;
        int i13 = i12 == 2 ? 4 : 5;
        if (i12 >= 0) {
            int[][] iArr = Ub.f7737d;
            if (i12 < iArr.length && i10 > 0) {
                int[] iArr2 = iArr[i12];
                if (i10 < iArr2.length) {
                    xb2 = xb2.a(iArr2[i10], i13);
                }
            }
        }
        return new Wb(xb2.a(i11, 5), this.f7765b, 0, this.f7768e + i13 + 5);
    }

    public int c() {
        return this.f7765b;
    }

    public String toString() {
        try {
            String[] strArr = Ub.f7734a;
            if (com.huawei.hms.scankit.util.b.a(strArr, this.f7765b)) {
                return String.format(Locale.ENGLISH, "%s bits=%d bytes=%d", strArr[this.f7765b], Integer.valueOf(this.f7768e), Integer.valueOf(this.f7767d));
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }
}
