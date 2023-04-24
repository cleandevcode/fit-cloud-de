package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.pa */
/* loaded from: classes.dex */
public final class C0702pa {

    /* renamed from: a */
    private final C0706qa f8028a = C0706qa.f8034a;

    private int[] a(C0709ra c0709ra) {
        int a10 = c0709ra.a();
        int[] iArr = new int[a10];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f8028a.b() && i10 < a10; i11++) {
            if (c0709ra.a(i11) == 0) {
                iArr[i10] = this.f8028a.b(i11);
                i10++;
            }
        }
        if (i10 == a10) {
            return iArr;
        }
        throw C0628a.a();
    }

    private int[] a(C0709ra c0709ra, C0709ra c0709ra2, int[] iArr) {
        int a10 = c0709ra2.a();
        int[] iArr2 = new int[a10];
        for (int i10 = 1; i10 <= a10; i10++) {
            iArr2[a10 - i10] = this.f8028a.c(i10, c0709ra2.b(i10));
        }
        C0709ra c0709ra3 = new C0709ra(this.f8028a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int b10 = this.f8028a.b(iArr[i11]);
            iArr3[i11] = this.f8028a.c(this.f8028a.d(0, c0709ra.a(b10)), this.f8028a.b(c0709ra3.a(b10)));
        }
        return iArr3;
    }

    private C0709ra[] a(C0709ra c0709ra, C0709ra c0709ra2, int i10) {
        if (c0709ra.a() >= c0709ra2.a()) {
            c0709ra2 = c0709ra;
            c0709ra = c0709ra2;
        }
        C0709ra c10 = this.f8028a.c();
        C0709ra a10 = this.f8028a.a();
        while (c0709ra.a() >= i10 / 2) {
            if (c0709ra.b()) {
                throw C0628a.a();
            }
            C0709ra c11 = this.f8028a.c();
            int b10 = this.f8028a.b(c0709ra.b(c0709ra.a()));
            while (c0709ra2.a() >= c0709ra.a() && !c0709ra2.b()) {
                int a11 = c0709ra2.a() - c0709ra.a();
                int c12 = this.f8028a.c(c0709ra2.b(c0709ra2.a()), b10);
                c11 = c11.a(this.f8028a.b(a11, c12));
                c0709ra2 = c0709ra2.c(c0709ra.a(a11, c12));
            }
            C0709ra c13 = c11.b(a10).c(c10).c();
            C0709ra c0709ra3 = c0709ra2;
            c0709ra2 = c0709ra;
            c0709ra = c0709ra3;
            c10 = a10;
            a10 = c13;
        }
        int b11 = a10.b(0);
        if (b11 != 0) {
            int b12 = this.f8028a.b(b11);
            return new C0709ra[]{a10.c(b12), c0709ra.c(b12)};
        }
        throw C0628a.a();
    }

    public int a(int[] iArr, int i10, int[] iArr2) {
        C0709ra c0709ra = new C0709ra(this.f8028a, iArr);
        int[] iArr3 = new int[i10];
        boolean z10 = false;
        for (int i11 = i10; i11 > 0; i11--) {
            int a10 = c0709ra.a(this.f8028a.a(i11));
            iArr3[i10 - i11] = a10;
            if (a10 != 0) {
                z10 = true;
            }
        }
        if (z10) {
            C0709ra a11 = this.f8028a.a();
            if (iArr2 != null) {
                for (int i12 : iArr2) {
                    int a12 = this.f8028a.a((iArr.length - 1) - i12);
                    C0706qa c0706qa = this.f8028a;
                    a11 = a11.b(new C0709ra(c0706qa, new int[]{c0706qa.d(0, a12), 1}));
                }
            }
            C0709ra[] a13 = a(this.f8028a.b(i10, 1), new C0709ra(this.f8028a, iArr3), i10);
            C0709ra c0709ra2 = a13[0];
            C0709ra c0709ra3 = a13[1];
            int[] a14 = a(c0709ra2);
            int[] a15 = a(c0709ra3, c0709ra2, a14);
            for (int i13 = 0; i13 < a14.length; i13++) {
                int length = (iArr.length - 1) - this.f8028a.c(a14[i13]);
                if (length < 0) {
                    throw C0628a.a();
                }
                iArr[length] = this.f8028a.d(iArr[length], a15[i13]);
            }
            return a14.length;
        }
        return 0;
    }
}
