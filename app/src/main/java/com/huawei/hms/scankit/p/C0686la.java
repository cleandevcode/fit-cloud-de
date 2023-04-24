package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import java.util.Formatter;

/* renamed from: com.huawei.hms.scankit.p.la */
/* loaded from: classes.dex */
final class C0686la {

    /* renamed from: a */
    private final C0662fa f7989a;

    /* renamed from: b */
    private final C0690ma[] f7990b;

    /* renamed from: c */
    private C0670ha f7991c;

    /* renamed from: d */
    private final int f7992d;

    public C0686la(C0662fa c0662fa, C0670ha c0670ha) {
        this.f7989a = c0662fa;
        int a10 = c0662fa.a();
        this.f7992d = a10;
        this.f7991c = c0670ha;
        this.f7990b = new C0690ma[a10 + 2];
    }

    private static int a(int i10, int i11, C0674ia c0674ia) {
        if (c0674ia == null || c0674ia.g()) {
            return i11;
        }
        if (c0674ia.a(i10)) {
            c0674ia.b(i10);
            return 0;
        }
        return i11 + 1;
    }

    private void a(int i10, int i11, C0674ia[] c0674iaArr) {
        C0674ia c0674ia = c0674iaArr[i11];
        C0674ia[] b10 = this.f7990b[i10 - 1].b();
        C0690ma c0690ma = this.f7990b[i10 + 1];
        C0674ia[] b11 = c0690ma != null ? c0690ma.b() : b10;
        C0674ia[] c0674iaArr2 = new C0674ia[14];
        c0674iaArr2[2] = b10[i11];
        c0674iaArr2[3] = b11[i11];
        if (i11 > 0) {
            int i12 = i11 - 1;
            c0674iaArr2[0] = c0674iaArr[i12];
            c0674iaArr2[4] = b10[i12];
            c0674iaArr2[5] = b11[i12];
        }
        if (i11 > 1) {
            int i13 = i11 - 2;
            c0674iaArr2[8] = c0674iaArr[i13];
            c0674iaArr2[10] = b10[i13];
            c0674iaArr2[11] = b11[i13];
        }
        if (i11 < c0674iaArr.length - 1) {
            int i14 = i11 + 1;
            c0674iaArr2[1] = c0674iaArr[i14];
            c0674iaArr2[6] = b10[i14];
            c0674iaArr2[7] = b11[i14];
        }
        if (i11 < c0674iaArr.length - 2) {
            int i15 = i11 + 2;
            c0674iaArr2[9] = c0674iaArr[i15];
            c0674iaArr2[12] = b10[i15];
            c0674iaArr2[13] = b11[i15];
        }
        for (int i16 = 0; i16 < 14 && !a(c0674ia, c0674iaArr2[i16]); i16++) {
        }
    }

    private void a(C0690ma c0690ma) {
        if (c0690ma != null) {
            try {
                ((C0694na) c0690ma).a(this.f7989a);
            } catch (ClassCastException unused) {
                throw C0628a.a();
            }
        }
    }

    private static boolean a(C0674ia c0674ia, C0674ia c0674ia2) {
        if (c0674ia2 != null && c0674ia2.g() && c0674ia2.a() == c0674ia.a()) {
            c0674ia.b(c0674ia2.c());
            return true;
        }
        return false;
    }

    private int f() {
        int g10 = g();
        if (g10 == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f7992d + 1; i10++) {
            C0674ia[] b10 = this.f7990b[i10].b();
            for (int i11 = 0; i11 < b10.length; i11++) {
                C0674ia c0674ia = b10[i11];
                if (c0674ia != null && !c0674ia.g()) {
                    a(i10, i11, b10);
                }
            }
        }
        return g10;
    }

    private int g() {
        h();
        return i() + j();
    }

    private void h() {
        C0690ma[] c0690maArr = this.f7990b;
        C0690ma c0690ma = c0690maArr[0];
        if (c0690ma == null || c0690maArr[this.f7992d + 1] == null) {
            return;
        }
        C0674ia[] b10 = c0690ma.b();
        C0674ia[] b11 = this.f7990b[this.f7992d + 1].b();
        for (int i10 = 0; i10 < b10.length; i10++) {
            C0674ia c0674ia = b10[i10];
            if (c0674ia != null && b11[i10] != null && c0674ia.c() == b11[i10].c()) {
                for (int i11 = 1; i11 <= this.f7992d; i11++) {
                    C0674ia c0674ia2 = this.f7990b[i11].b()[i10];
                    if (c0674ia2 != null) {
                        c0674ia2.b(b10[i10].c());
                        if (!c0674ia2.g()) {
                            this.f7990b[i11].b()[i10] = null;
                        }
                    }
                }
            }
        }
    }

    private int i() {
        C0690ma c0690ma = this.f7990b[0];
        if (c0690ma == null) {
            return 0;
        }
        C0674ia[] b10 = c0690ma.b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10.length; i11++) {
            C0674ia c0674ia = b10[i11];
            if (c0674ia != null) {
                int c10 = c0674ia.c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f7992d + 1 && i12 < 2; i13++) {
                    C0674ia c0674ia2 = this.f7990b[i13].b()[i11];
                    if (c0674ia2 != null) {
                        i12 = a(c10, i12, c0674ia2);
                        if (!c0674ia2.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    private int j() {
        C0690ma c0690ma = this.f7990b[this.f7992d + 1];
        if (c0690ma == null) {
            return 0;
        }
        C0674ia[] b10 = c0690ma.b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10.length; i11++) {
            C0674ia c0674ia = b10[i11];
            if (c0674ia != null) {
                int c10 = c0674ia.c();
                int i12 = 0;
                for (int i13 = this.f7992d + 1; i13 > 0 && i12 < 2; i13--) {
                    C0674ia c0674ia2 = this.f7990b[i13].b()[i11];
                    if (c0674ia2 != null) {
                        i12 = a(c10, i12, c0674ia2);
                        if (!c0674ia2.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    public int a() {
        return this.f7992d;
    }

    public C0690ma a(int i10) {
        return this.f7990b[i10];
    }

    public void a(int i10, C0690ma c0690ma) {
        this.f7990b[i10] = c0690ma;
    }

    public void a(C0670ha c0670ha) {
        this.f7991c = c0670ha;
    }

    public int b() {
        return this.f7989a.b();
    }

    public int c() {
        return this.f7989a.c();
    }

    public C0670ha d() {
        return this.f7991c;
    }

    public C0690ma[] e() {
        a(this.f7990b[0]);
        a(this.f7990b[this.f7992d + 1]);
        int i10 = 928;
        while (true) {
            int f10 = f();
            if (f10 <= 0 || f10 >= i10) {
                break;
            }
            i10 = f10;
        }
        return this.f7990b;
    }

    public String toString() {
        C0690ma[] c0690maArr = this.f7990b;
        C0690ma c0690ma = c0690maArr[0];
        if (c0690ma == null) {
            c0690ma = c0690maArr[this.f7992d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < c0690ma.b().length; i10++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i10));
                for (int i11 = 0; i11 < this.f7992d + 2; i11++) {
                    C0690ma c0690ma2 = this.f7990b[i11];
                    if (c0690ma2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C0674ia c0674ia = c0690ma2.b()[i10];
                        if (c0674ia == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c0674ia.c()), Integer.valueOf(c0674ia.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
